package org.utility;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestHelper {
    private String baseURI;
    private String basePath;
    private RequestSpecification request;

    public RequestHelper(String baseURI) {
        this.baseURI = baseURI;
        this.request = RestAssured.given().baseUri(baseURI);
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public void setContentType(ContentType contentType) {
        request.contentType(contentType);
    }

    public void setRequestBody(String requestBody) {
        request.body(requestBody);
    }

    public Response sendPostRequest() {
        if (basePath != null) {
            return request.post(basePath);
        } else {
            throw new IllegalArgumentException("Base path not set. Please call setBasePath() before sending the request.");
        }
    }

    // You can add more methods for other HTTP methods (e.g., GET, PUT, DELETE)

    public void clearRequest() {
        request = RestAssured.given().baseUri(baseURI);
    }
}

