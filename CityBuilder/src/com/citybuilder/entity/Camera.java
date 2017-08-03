package com.citybuilder.entity;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.citybuilder.Handler;
import com.citybuilder.tile.Tile;

public class Camera {
	protected Handler handler;
	protected float x, y;
	protected Rectangle bounds;
	protected float speed;
	protected float xMove, yMove, xVel, yVel;
	
	public Camera(Handler handler, float x, float y) {
		this.handler = handler;
		this.x = x;
		this.y = y;
		xMove = x;
		yMove = y;
		speed = 8f;
		bounds = new Rectangle(-800, -448, 1600, 896);
	}
		
	public void tick(){
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
	}
	
	public void render(Graphics g){
		//Graphics2D g2d = (Graphics2D) g.create();
		//g2d.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()), (int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		
		if(handler.getKeyManager().up){
			yMove = -speed;
		}
		if(handler.getKeyManager().down){
			yMove = speed;
		}
		if(handler.getKeyManager().left){
			xMove = -speed;
		}
		if(handler.getKeyManager().right){
			xMove = speed;
		}
	}
	
	public void move(){
		moveX();
		moveY();
	}
	
	public void moveX(){
		if(xMove > 0){//right
			int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;
			if(!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT) &&
					!collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)){
				x += xMove;
			}else{
				x = tx * Tile.TILEWIDTH - bounds.x - bounds.width - 1;
			}
		}else if(xMove < 0){//left
			int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;
			if(!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT) &&
					!collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)){
				x += xMove;
			}else{
				x = tx * Tile.TILEWIDTH + Tile.TILEWIDTH - bounds.x;
			}
		}
	}
	
	public void moveY(){
		if(yMove < 0){//up
			int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;
			if(!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty) &&
					!collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)){
				y += yMove;
			}else{
				y = ty * Tile.TILEHEIGHT + Tile.TILEHEIGHT - bounds.y;
			}
		}else if(yMove > 0){//down
			int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;
			if(!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty) &&
					!collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)){
				y += yMove;
			}else{
				y = ty * Tile.TILEHEIGHT - bounds.y - bounds.height - 1;
			}
		}
	}
	
	protected boolean collisionWithTile(int x, int y){
		return handler.getWorld().getTile(x, y).isEdge();
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
}
