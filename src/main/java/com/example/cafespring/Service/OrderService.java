package com.example.cafespring.Service;

import com.example.cafespring.Entity.OrderEntity;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<OrderEntity> findAll();
    Optional<OrderEntity> findById(Long id);
    List<OrderEntity> findOrdersByDate(Date date);
    List<OrderEntity> findOrdersInDateRange(Date startDate, Date endDate);
    OrderEntity saveOrder(OrderEntity orderEntity);
    OrderEntity updateOrder(OrderEntity orderEntity);
    void deleteOrder(Long id);
}