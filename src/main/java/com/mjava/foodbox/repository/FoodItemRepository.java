package com.mjava.foodbox.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

 
import com.mjava.foodbox.model.Fooditem;

@Repository
public interface FoodItemRepository extends JpaRepository<Fooditem,Integer>{
	 @Query("select f from tbl_fooditem f where fcatid=?1")
	    public List<Fooditem> findFoodItemByCat(int catid);
	 
	 @Query("select f from tbl_fooditem f where fid=?1")
	    public  Fooditem  findFoodItemByfid(int fid);
	 
	 
}
