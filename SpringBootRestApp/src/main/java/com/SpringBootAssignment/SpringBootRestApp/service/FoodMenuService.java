package com.SpringBootAssignment.SpringBootRestApp.service;

import java.util.List;


import com.SpringBootAssignment.SpringBootRestApp.entities.FoodMenu;

public interface FoodMenuService {

	public List<FoodMenu> getMenu();
	public FoodMenu getFood(int FoodID);
	public FoodMenu addFood(FoodMenu foodmenu);
	public void deleteFoodMenu(int parseint);
}
