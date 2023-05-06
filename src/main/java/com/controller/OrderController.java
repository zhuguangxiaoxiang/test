package com.controller;

import com.entiy.Order;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/list/{page}/{pers}")
    public Map<String, Object> getOrderList(@PathVariable int page, @PathVariable int pers) {
        List<Order> orders = orderService.getOrderList(page, pers);
        for (Order order : orders) {
            System.out.println(order);
        }
        int total = orderService.getOrderCount();
        Map<String, Object> result = new HashMap<>();
        result.put("total", total);
        result.put("data", orders);
        result.put("page", page);
        result.put("pers", pers);
        result.put("hasNext", (page * pers) < total);
        return result;
    }

    @PostMapping("/last")
    public List<Order> getLastOrderList() {
        List<Order> list = orderService.getLastOrderList();
        list.forEach(System.out::println);
        return list;
    }
}
