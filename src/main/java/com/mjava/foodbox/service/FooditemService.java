package com.mjava.foodbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjava.foodbox.model.Categeory;
import com.mjava.foodbox.model.Fooditem;
 
import com.mjava.foodbox.repository.FoodItemRepository;

@Service
public class FooditemService {
	@Autowired
	public FoodItemRepository fooditemRepo;
	
	public void insertFooditem(Fooditem fooditem)
	
	{
		fooditemRepo.save(fooditem);
	}
	
	public List<Fooditem> getFooditemsByCatidService(int catid)

{
		List<Fooditem> listFooditems;
		listFooditems=fooditemRepo.findFoodItemByCat(catid);
		return listFooditems;
		}
	
	public List<Fooditem> getAllFooditemsService()

	{
			List<Fooditem> listFooditems;
			listFooditems=fooditemRepo.findAll();
			return listFooditems;
			}
	
	public  Fooditem  getFooditemByfidService(int fid)

	{
		Fooditem  fooditem;
		fooditem=fooditemRepo.findFoodItemByfid(fid);
			return fooditem;
			}
}
