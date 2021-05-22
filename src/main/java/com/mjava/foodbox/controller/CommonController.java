package com.mjava.foodbox.controller;

import java.lang.module.ResolutionException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjava.foodbox.model.Categeory;
import com.mjava.foodbox.model.Fooditem;
import com.mjava.foodbox.model.Order;
import com.mjava.foodbox.model.Register;
import com.mjava.foodbox.model.User;
import com.mjava.foodbox.repository.CategeoryRepository;
import com.mjava.foodbox.repository.FoodItemRepository;
import com.mjava.foodbox.service.CategeoryService;
import com.mjava.foodbox.service.FooditemService;
import com.mjava.foodbox.service.OrderService;
import com.mjava.foodbox.service.RegisterService;
import com.mjava.foodbox.service.UserService;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class CommonController {

	@Autowired
	public   UserService userService;
	@Autowired
	public   RegisterService registerService;
	@Autowired
	public   CategeoryService categeoryService;
	@Autowired
	public   FooditemService fooditemService;
	
	@Autowired
	public   OrderService orderService;
	
	@GetMapping("/login/{username}/{password}/{rollid}")
	 public Register loginUser(@PathVariable String username,@PathVariable String password,@PathVariable int rollid)
	{
		Register registerUser = null;
		registerUser =userService.findLoginUserService(username,password,rollid);
		return registerUser;
	}
	
	@PostMapping("/register")
	public void registerNewUser(@RequestBody Register register)
	{
		registerService.newUserRegister(register);
	}
	
	@PostMapping("/categeory")
	public void categeoryInsert(@RequestBody Categeory categeory)
	{
		 
		categeoryService.insertCategeory(categeory);
	}
	@PostMapping("/fooditem")
	public void fooditemInsert(@RequestBody Fooditem fooditem)
	{
		  
		fooditemService.insertFooditem(fooditem);
	}
	@PostMapping("/orderinsert")
	public void orderInsert(@RequestBody Order order)
	{
		  
		orderService.insertOrderService(order);
	}
	@GetMapping("/changepassword/{currentpassword}/{newpassword}")
	public  int  ChangeAdminPassword(@PathVariable String currentpassword,@PathVariable String newpassword)
	{
		int result=0;
		result= userService.changePasswordService(newpassword,currentpassword);
		    return result;
		
	}
	@GetMapping("/getcategeory")
	public  List<Categeory>  getCategeoryData()
	{
		List<Categeory> listCategeory;
		 
		listCategeory= categeoryService.getCategeoryService();
		    return listCategeory;
		
	}
	
	@GetMapping("/foodlistitem/{catid}")
	public List<Fooditem> getfoodItemsWithCatId(@PathVariable int catid)
	{
		return (List<Fooditem>) fooditemService.getFooditemsByCatidService(catid);
		
	}
	
	
	
	@GetMapping("/allfoodlistitem")
	public List<Fooditem> getAllFooditemsController()
	{
		return (List<Fooditem>) fooditemService.getAllFooditemsService();
		
	}
	
	@GetMapping("/categeoryitem/{catid}")
	public  Categeory getCategeoryByCatidController(@PathVariable int catid)
	{
		return   categeoryService.getCategeoryByCatidService(catid);
		
	}
	@GetMapping("/fooditemwithfid/{fid}")
	public  Fooditem  getfoodItemsWithfId(@PathVariable int fid)
	{
		return   fooditemService.getFooditemByfidService(fid);
		
	}
	
	@Autowired
	public CategeoryRepository categeoryRepo;
	
	@PutMapping("/updatecategeory/{catid}")
	public ResponseEntity<Categeory> updateCategeoryWithCatId(@PathVariable int catid,@RequestBody Categeory categeoryDetails)
	{
		Categeory categeory=categeoryRepo.findById(catid)
				.orElseThrow(()->new  ResolutionException());	
		categeory.setCatid(categeoryDetails.getCatid());
		categeory.setCatName(categeoryDetails.getCatName());
		categeory.setCatimglink(categeoryDetails.getCatimglink());
	 
		 
		Categeory updatedCategeory=categeoryRepo.save(categeory); 
		return ResponseEntity.ok(updatedCategeory);
		
	}
	
	@Autowired
	public FoodItemRepository fooditemRepo;
	@PutMapping("/updatefooditem/{fid}")
	public ResponseEntity<Fooditem> updateFooditemWithfId(@PathVariable int fid,@RequestBody Fooditem fooditemDetails)
	{
		Fooditem fooditem=fooditemRepo.findById(fid)
				.orElseThrow(()->new  ResolutionException());	
		fooditem.setFid(fooditemDetails.getFid());
		fooditem.setFcatid(fooditemDetails.getFcatid());
		fooditem.setFname(fooditemDetails.getFname());
		fooditem.setPrice(fooditemDetails.getPrice());
		fooditem.setFimglink(fooditemDetails.getFimglink());
		 
		Fooditem updatedFooditem=fooditemRepo.save(fooditem); 
		return ResponseEntity.ok(updatedFooditem);
		
	}
	
	//Delete FoodItem
	@DeleteMapping("/deletefooditem/{fid}")
	public ResponseEntity<Map<String,Boolean>> deleteFoodIyem(@PathVariable int fid)
	{
		
		Fooditem fooditem=fooditemRepo.findById(fid)
				.orElseThrow(()->new  ResolutionException());
		fooditemRepo.delete(fooditem);
		
		Map<String,Boolean> response=new HashMap<>(); 
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
