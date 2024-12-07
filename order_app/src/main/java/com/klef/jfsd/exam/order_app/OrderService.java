package com.klef.jfsd.exam.order_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }
}
