package com.oata.practice;

import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiClient {
    public Response post(Map map, String body, String url, int statusCode){
        Response response = given(). // Building the request
                headers(map). // setting the headers
                body(body). // setting the body
                post(url);// Hitting the api with Post method
        response.prettyPrint();
        response.then().
                statusCode(statusCode);// url
        return response;
    }
}
