package org.business;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.utility.RequestHelper;

public class PostRequestExample {
    public static void main(String[] args) {
        // Create an instance of RequestHelper with the base URI
        RequestHelper requestHelper = new RequestHelper("https://reqres.in");

        // Set the base path (the specific API endpoint)
        requestHelper.setBasePath("/api/users");

        // Set the content type
        requestHelper.setContentType(ContentType.JSON);

        // Set the request body (JSON payload)
        String requestBody = "{\n" +
                "    \"name\": \"John\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        requestHelper.setRequestBody(requestBody);

        // Send a POST request
        Response response = requestHelper.sendPostRequest();

        // Get and print the response body
        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        // Get and print the response status code
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
    }
}
