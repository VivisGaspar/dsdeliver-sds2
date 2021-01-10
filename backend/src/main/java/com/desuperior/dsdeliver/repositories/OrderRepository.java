package com.desuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
