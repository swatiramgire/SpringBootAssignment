package com.SpringBootAssignment.SpringBootRestApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootAssignment.SpringBootRestApp.entities.FoodMenu;

public interface FoodMenuDao extends JpaRepository<FoodMenu, Integer>
{

}
