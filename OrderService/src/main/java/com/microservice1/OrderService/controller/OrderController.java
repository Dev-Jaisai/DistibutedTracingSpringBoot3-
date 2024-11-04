package com.microservice1.OrderService.controller;

import com.microservice1.OrderService.client.ProductClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final ProductClient productClient;

    public OrderController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping("/orders/{productId}")
    public String getOrder(@PathVariable String productId) {
        String productDetails = productClient.getProduct(productId);
        return "Order placed for: " + productDetails;
    }
}
