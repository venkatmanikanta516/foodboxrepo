package com.mjava.foodbox.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjava.foodbox.model.Categeory;
import com.mjava.foodbox.model.Fooditem;
import com.mjava.foodbox.repository.CategeoryRepository;

@Service
public class CategeoryService {
	
	@Autowired
	public CategeoryRepository categeoryRepo;
	
	public void insertCategeory(Categeory categeory)
	
	{
		categeoryRepo.save(categeory);
	}
	 
public List<Categeory> getCategeoryService()
	
	{
	List<Categeory> listCategeory;//=new ArrayList<>();
	listCategeory=categeoryRepo.findAll();
	return listCategeory;
	}
public  Categeory  getCategeoryByCatidService(int catid)

{
		 Categeory  categeory;
		 categeory=categeoryRepo.findCategeoryByCat(catid);
		return categeory;
		}
}
