package com.citybuilder.city;

import com.citybuilder.Handler;

public class City {
	
	protected int maxBuildings;
	protected int maxLevel;
	protected Handler handler;
	protected int gold;
	protected int stone;
	protected int wood;
	protected int iron;
	protected int food;
	protected String name;
	
	public City(Handler handler, int maxBuildings, int maxLevel, int gold, int stone, int wood, int iron, int food){
		this.handler = handler;
		this.maxBuildings = maxBuildings;
		this.maxLevel = maxLevel;
		this.gold = gold;
		this.stone = stone;
		this.wood = wood;
		this.iron = iron;
		this.food = food;
	}


	public int getMaxBuildings() {
		return maxBuildings;
	}


	public void setMaxBuildings(int maxBuildings) {
		this.maxBuildings = maxBuildings;
	}


	public int getMaxLevel() {
		return maxLevel;
	}


	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}


	public int getGold() {
		return gold;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public int getStone() {
		return stone;
	}


	public void setStone(int stone) {
		this.stone = stone;
	}


	public int getWood() {
		return wood;
	}


	public void setWood(int wood) {
		this.wood = wood;
	}


	public int getIron() {
		return iron;
	}


	public void setIron(int iron) {
		this.iron = iron;
	}


	public int getFood() {
		return food;
	}


	public void setFood(int food) {
		this.food = food;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
