package com.springcloud.eureka.client.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ProductController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${message}")
    private String message;

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable("id") String id) {
        return "Product ID: " + id + ", From port: " + serverPort;
    }

    @GetMapping("/product")
    public String getProductString() {
        return "Product port: " + serverPort + " and message: " + message;
    }
}
