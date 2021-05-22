package com.mjava.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjava.foodbox.model.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register,Integer> {

}
