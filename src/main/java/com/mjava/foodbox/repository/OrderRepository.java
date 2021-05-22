package com.mjava.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjava.foodbox.model.Fooditem;
import com.mjava.foodbox.model.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order,Integer>{

}
