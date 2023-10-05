package org.business;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestExample {
    public static void main(String[] args) {
        // Define the base URL of the API
        RestAssured.baseURI = "https://reqres.in";

        // Create a request specification
        RequestSpecification request = RestAssured.given();

        // Define the request body (JSON payload)
        String requestBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";


        // Set the content type
        request.contentType(ContentType.JSON);

        // Set the request body
        request.body(requestBody);

        // Send a POST request to a specific endpoint
        Response response = request.post("/api/users");

        // Get and print the response body
        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        // Get and print the response status code
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
    }
}
