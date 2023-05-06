package com.service.impl;

import com.entiy.Order;
import com.mapper.OrderMapper;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2023/5/6
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Order> getOrderList(int page, int pers) {
        page = (page - 1) * pers;
        return orderMapper.getOrderList(page, pers);
    }

    @Override
    public int getOrderCount() {
        return orderMapper.getOrderCount();
    }

    @Override
    public List<Order> getLastOrderList() {
        return orderMapper.getLastOrderList();
    }


}
