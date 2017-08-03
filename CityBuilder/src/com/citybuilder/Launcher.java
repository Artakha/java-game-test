package com.citybuilder;

import com.citybuilder.world.WorldGenerator;

public class Launcher {
	public static void main(String[] args){
		Game game = new Game("City Builder", 1600, 896);
		game.start();
		WorldGenerator.generate();
	}
}
