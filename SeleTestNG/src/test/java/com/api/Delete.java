package com.api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Delete {
	@Test
	public void deleteTest() {
		delete("https://dummyjson.com/products/25")
        .then()
          .log().body()
            .statusCode(200);  
        System.out.println("DELETE PRODUCT");
		
	}

}
