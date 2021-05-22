package com.mjava.foodbox.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mjava.foodbox.model.Categeory;
import com.mjava.foodbox.model.Fooditem;
import com.mjava.foodbox.model.Register;

@Repository
public interface CategeoryRepository extends JpaRepository<Categeory,Integer> {
	@Query("select f from tbl_categeory f where catid=?1")
    public  Categeory  findCategeoryByCat(int catid);
 
}
