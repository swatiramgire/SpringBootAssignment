package com.SpringBootAssignment.SpringBootRestApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootAssignment.SpringBootRestApp.dao.FoodMenuDao;
import com.SpringBootAssignment.SpringBootRestApp.entities.FoodMenu;

@Service
public class FoodMenuServiceImpl implements FoodMenuService {
	@Autowired
	private FoodMenuDao FMD;
	
	public FoodMenuServiceImpl()
	{
	}

	@Override
	public List<FoodMenu> getMenu() {
		return FMD.findAll();
	}

	@Override
	public FoodMenu getFood(int FoodID) {
		return FMD.getOne(FoodID);
	}

	@Override
	public FoodMenu addFood(FoodMenu foodmenu) {
		FMD.save(foodmenu);
		return foodmenu;
	}

	@Override
	public void deleteFoodMenu(int parseint) {
		FoodMenu entity=FMD.getOne(parseint);
		FMD.delete(entity);
	}

}
