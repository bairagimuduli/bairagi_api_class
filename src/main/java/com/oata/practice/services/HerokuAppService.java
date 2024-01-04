package com.oata.practice.services;

import io.restassured.response.Response;
import com.oata.practice.ApiClient;

import java.util.HashMap;

public class HerokuAppService {
    String uri = "https://restful-booker.herokuapp.com/";
    ApiClient apiClient;

    public HerokuAppService() {  // default constructor
        this.apiClient = new ApiClient(); // override the default constructor
    }

    public void createToken(String userName, String password){
        HashMap<String, String> map = new HashMap<>();
        map.put("Content-Type", "application/json");
        String body = "{\n" +    //body
                "    \"username\" : \""+userName+"\",\n" +
                "    \"password\" : \""+password+"\"\n" +
                "}";
        Response response = apiClient.post(map, body, uri + "auth", 200);
    }


}
