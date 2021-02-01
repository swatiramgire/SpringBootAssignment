package com.SpringBootAssignment.SpringBootRestApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="FoodData")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class FoodMenu {
	@Id
	private int id;
	@Column(name="foodName")
	private String foodName;
	@Column(name="description")
	private String description;
	public FoodMenu(int id, String foodName, String description) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.description = description;
	}
	public FoodMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "FoodMenu [id=" + id + ", foodName=" + foodName
				+ ", description=" + description + "]";
	}
	

}
