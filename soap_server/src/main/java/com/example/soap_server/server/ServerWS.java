package com.example.soap_server.server;

import com.example.soap_server.webservice.ProductWebService;
import jakarta.xml.ws.Endpoint;

public class ServerWS {
    public static void main(String[] args) {
        String url = "http://localhost:8088/ws";
        Endpoint.publish(url, new ProductWebService());
        System.out.println(url + " deployed");
    }
}
