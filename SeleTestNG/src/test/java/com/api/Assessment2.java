package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Assessment2 {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://example.com";

        try {

            // =================================
            // STEP 1 — CREATE ORDER (POST)
            // =================================

            String createOrderBody = "{\n" +
                    "  \"productName\": \"Mobile Phone\",\n" +
                    "  \"quantity\": 3\n" +
                    "}";

            long startTime = System.currentTimeMillis();

            Response createOrderResponse =
                    given()
                        .header("Content-Type", "application/json")
                        .body(createOrderBody)
                    .when()
                        .post("/api/orders")
                    .then()
                        .statusCode(201)
                        .extract().response();

            long responseTime = System.currentTimeMillis() - startTime;

            if (responseTime > 3000) {
                throw new RuntimeException("Create Order API is slow: " + responseTime + " ms");
            }

            System.out.println("Create Order Response:");
            System.out.println(createOrderResponse.asString());

            // =================================
            // STEP 2 — EXTRACT orderId USING GSON
            // =================================

            JsonObject jsonObject = JsonParser
                    .parseString(createOrderResponse.asString())
                    .getAsJsonObject();

            String orderId = jsonObject.get("orderId").getAsString();

            if (orderId == null || orderId.isEmpty()) {
                throw new RuntimeException("orderId not returned from API!");
            }

            System.out.println("Extracted Order ID: " + orderId);

            // =================================
            // STEP 3 — GET ORDER (PATH + QUERY PARAM)
            // =================================

            Response getOrderResponse =
                    given()
                        .pathParam("id", orderId)
                        .queryParam("includeDetails", true)
                    .when()
                        .get("/api/orders/{id}")
                    .then()
                        .statusCode(200)
                        .extract().response();

            System.out.println("Get Order Response:");
            System.out.println(getOrderResponse.asString());

            // =================================
            // STEP 4 — VALIDATE RESPONSE FIELDS
            // =================================

            String productName = getOrderResponse.jsonPath().getString("productName");
            int quantity = getOrderResponse.jsonPath().getInt("quantity");

            if (productName == null || quantity <= 0) {
                throw new RuntimeException("Invalid order data received!");
            }

            System.out.println("Product Name: " + productName);
            System.out.println("Quantity: " + quantity);

            // =================================
            // FINAL RESULT
            // =================================

            System.out.println("ALL ORDER API TESTS PASSED SUCCESSFULLY!");

        } catch (Exception e) {
            System.out.println("TEST FAILED: " + e.getMessage());
        }
    }
}