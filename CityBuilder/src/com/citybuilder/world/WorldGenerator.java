package com.citybuilder.world;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WorldGenerator {
	
	public static void generate(){  
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("res/worlds/world.txt")))) {
			int worldX = 1000;
			int worldY = 1000;
			int worldSize = (worldX + 2) * (worldY + 2);
		    writer.write((worldX + 2) + " " + (worldY + 2) + "\n0 0\n");
		    int[] numbers = new int[worldSize];
		    for(int x = 0; x < worldSize; x++){
		    	if (x < (worldX + 2) || x%(worldX + 2) == 0 || x%(worldX + 2) == (worldX + 1) || x > ((worldX + 2) * (worldY + 1))){
		    		numbers[x] = 4;
		    	} else {
		    		numbers[x] = (int)(Math.random() * 4);
		    	}
		    }
		    int counter = 0;
		    for(int y = 0; y < worldSize; y++){
		    	counter++;
		    	if(counter%(worldX+2) != 0){
		    		writer.write(numbers[y] + " ");
		    	} else {
		    		writer.write(numbers[y] + "\n");
		    	}
		    }
		    writer.close();
		} catch (IOException ex) {
		    System.out.println("unable to generate world");
		}
	}
}
