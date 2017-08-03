package com.citybuilder.city.buildings;

import com.citybuilder.Handler;

public abstract class Building {
	
	protected int maxLevel;
	protected int goldCost;
	protected int woodCost;
	protected int stoneCost;
	protected int ironCost;
	protected double buildTime;
	protected Handler handler;
	
	public Building(Handler handler, int maxLevel, int goldCost, int woodCost, int stoneCost, int ironCost, double buildTime){
		this.handler = handler;
		this.maxLevel = maxLevel;
		this.goldCost = goldCost;
		this.woodCost = woodCost;
		this.stoneCost = stoneCost;
		this.ironCost = ironCost;
		this.buildTime = buildTime;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public int getGoldCost() {
		return goldCost;
	}

	public void setGoldCost(int goldCost) {
		this.goldCost = goldCost;
	}

	public int getWoodCost() {
		return woodCost;
	}

	public void setWoodCost(int woodCost) {
		this.woodCost = woodCost;
	}

	public int getStoneCost() {
		return stoneCost;
	}

	public void setStoneCost(int stoneCost) {
		this.stoneCost = stoneCost;
	}

	public int getIronCost() {
		return ironCost;
	}

	public void setIronCost(int ironCost) {
		this.ironCost = ironCost;
	}

	public double getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(double buildTime) {
		this.buildTime = buildTime;
	}
	
	
}
