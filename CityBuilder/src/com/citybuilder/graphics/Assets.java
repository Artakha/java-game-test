package com.citybuilder.graphics;

import java.awt.image.BufferedImage;

public class Assets {
private static final int width = 32, height = 32;
	
	public static BufferedImage player, dirt, grass, stone, tree, city, edge;
	public static BufferedImage[] btn_newgame;

	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		
		btn_newgame = new BufferedImage[2];
		btn_newgame[0] = sheet.crop(width, 0, width, height);
		btn_newgame[1] = sheet.crop(width, height, width, height);
		
		player = sheet.crop(0, 0, width, height);
		dirt = sheet.crop(width, 0, width, height);
		grass = sheet.crop(width * 2, 0, width, height);
		stone = sheet.crop(width * 3, 0, width, height);
		tree = sheet.crop(0, height, width, height);
		city = sheet.crop(width, height, width, height);
		edge = sheet.crop(width, height, width, height);
	}
}
