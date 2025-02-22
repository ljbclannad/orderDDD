package com.example.orderddd.domain.service;

import org.springframework.beans.BeanUtils;

import com.example.orderddd.anticorruption.cqrs.commond.CreateOrderCommand;
import com.example.orderddd.domain.model.aggregate.Order;

/**
 * 订单领域服务-仅操作订单
 * 
 * @author lejb
 * @version 1.0
 */
public class OrderDomainService {

    /**
     * 创建订单
     * 
     * @param createOrderCommand 创建订单命令
     * @param user               用户
     * @return 订单
     */
    public Order createOrder(CreateOrderCommand createOrderCommand) {

        Order order = new Order();
        BeanUtils.copyProperties(createOrderCommand, order);
        return order;
    }

}
