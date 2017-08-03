package com.citybuilder.state;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import com.citybuilder.Handler;
import com.citybuilder.graphics.Assets;
import com.citybuilder.ui.ClickListener;
import com.citybuilder.ui.UIImageButton;
import com.citybuilder.ui.UIManager;

public class MenuState extends State{
	
	private UIManager uiManager;
	
	public MenuState(Handler handler){
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(736, 250, 128, 64, Assets.btn_newgame, new ClickListener(){

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}}));
		
		uiManager.addObject(new UIImageButton(736, 375, 128, 64, Assets.btn_newgame, new ClickListener(){

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				System.out.println("unimplemented load game");
			}}));
		
		uiManager.addObject(new UIImageButton(736, 500, 128, 64, Assets.btn_newgame, new ClickListener(){

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				System.out.println("unimplemented options");
			}}));
		
		uiManager.addObject(new UIImageButton(736, 625, 128, 64, Assets.btn_newgame, new ClickListener(){

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				System.exit(0);
			}}));
		
	}

	@Override
	public void tick() {
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(0, 0, 1600, 896);
		uiManager.render(g);
	}

}
