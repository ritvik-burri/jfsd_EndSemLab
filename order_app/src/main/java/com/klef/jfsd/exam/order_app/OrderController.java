package com.klef.jfsd.exam.order_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public String addOrder(@RequestBody Order order) {
        if (order.getOrderId() == null) {
            return "Order ID must not be null!";
        }
        orderRepository.save(order);
        return "Order added successfully!";
    }
}
