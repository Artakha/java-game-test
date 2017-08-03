package com.citybuilder.state;

import java.awt.Color;
import java.awt.Graphics;

import com.citybuilder.Handler;
import com.citybuilder.entity.Camera;
import com.citybuilder.graphics.Assets;
import com.citybuilder.ui.ClickListener;
import com.citybuilder.ui.UIImageButton;
import com.citybuilder.ui.UIManager;
import com.citybuilder.world.World;

public class GameState extends State {
	
	private Camera camera;
	private World world;
	private ClickListener clicker;
	
	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world.txt");
		handler.setWorld(world);
		camera = new Camera(handler, 1600, 896);
	}

	@Override
	public void tick() {
		world.tick();
		camera.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		//camera.render(g);
	}
	
	

}
