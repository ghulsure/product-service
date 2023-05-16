package com.example.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class productController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/product-service/api")
    public String getValues() {
        return "Getting Called by product service";
    }

    @GetMapping("/product-order")
    public String callService1() {
        String val = restTemplate.getForObject("http://order-service:8080/order-service/api", String.class);
        return "Service call from service 2 to service 1 --- " + val;
    }
}
