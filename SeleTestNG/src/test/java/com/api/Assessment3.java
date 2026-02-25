package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Assessment3 {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://example.com";

        try {

            // =========================================
            // STEP 1: FETCH OAUTH TOKEN (POST)
            // =========================================

            long startTime = System.currentTimeMillis();

            Response tokenResponse =
                    given()
                        .contentType("application/x-www-form-urlencoded")
                        .formParam("clientId", "testClient")
                        .formParam("clientSecret", "testSecret")
                    .when()
                        .post("/oauth/token")
                    .then()
                        .statusCode(200)
                        .extract().response();

            long responseTime = System.currentTimeMillis() - startTime;

            if (responseTime > 3000) {
                throw new RuntimeException("Token API too slow: " + responseTime + " ms");
            }

            System.out.println("Token API Response:");
            System.out.println(tokenResponse.asString());

            // =========================================
            // STEP 2: EXTRACT access_token USING GSON
            // =========================================

            JsonObject jsonObject = JsonParser
                    .parseString(tokenResponse.asString())
                    .getAsJsonObject();

            String accessToken = jsonObject.get("access_token").getAsString();

            if (accessToken == null || accessToken.isEmpty()) {
                throw new RuntimeException("Access token not returned!");
            }

            System.out.println("Extracted Access Token: " + accessToken);

            // =========================================
            // STEP 3: CALL SECURED REPORTS API
            // =========================================

            Response reportsResponse =
                    given()
                        .header("Authorization", "Bearer " + accessToken)
                    .when()
                        .get("/api/reports")
                    .then()
                        .statusCode(200)
                        .extract().response();

            System.out.println("Reports API Response:");
            System.out.println(reportsResponse.asString());

            // =========================================
            // STEP 4: VALIDATE RESPONSE IS JSON ARRAY
            // =========================================

            if (!reportsResponse.jsonPath().get().getClass().getSimpleName().equals("ArrayList")) {
                throw new RuntimeException("Reports response is not a JSON array!");
            }

            // =========================================
            // STEP 5: BASIC FIELD VALIDATION
            // =========================================

            int reportCount = reportsResponse.jsonPath().getList("$").size();

            if (reportCount == 0) {
                throw new RuntimeException("Reports array is empty!");
            }

            Object firstReportId = reportsResponse.jsonPath().get("id[0]");
            Object firstReportName = reportsResponse.jsonPath().get("name[0]");

            if (firstReportId == null || firstReportName == null) {
                throw new RuntimeException("Report fields missing!");
            }

            System.out.println("Total Reports: " + reportCount);
            System.out.println("First Report ID: " + firstReportId);
            System.out.println("First Report Name: " + firstReportName);

            // =========================================
            // FINAL SUCCESS
            // =========================================

            System.out.println("OAUTH SECURED API TEST PASSED SUCCESSFULLY!");

        } catch (Exception e) {
            System.out.println("TEST FAILED: " + e.getMessage());
        }
    }
}