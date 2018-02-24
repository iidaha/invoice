package com.github.iidaha.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.iidaha.db.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

}
