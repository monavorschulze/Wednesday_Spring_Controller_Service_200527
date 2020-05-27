package de.neuefische.springgroupproject1.controller;


import de.neuefische.springgroupproject1.model.Order;
import de.neuefische.springgroupproject1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

private final OrderService orderService;

@Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getOrderList (){
        return orderService.getOrderList();
    }

}
