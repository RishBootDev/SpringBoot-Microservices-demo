package com.rishbootdev.orderservice.repository;

import com.rishbootdev.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Order, Long> {
}
