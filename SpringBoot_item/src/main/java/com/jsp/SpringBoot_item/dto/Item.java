package com.jsp.SpringBoot_item.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
	
	@Id
	private int id;
	private String name;
	private double cost;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Item [Id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
}
