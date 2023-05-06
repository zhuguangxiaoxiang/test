package com.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.entiy.Order;
import com.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2023/5/6
 */
public interface OrderService {
    List<Order> getOrderList(int page, int pers);

    int getOrderCount();

    List<Order> getLastOrderList();
}
