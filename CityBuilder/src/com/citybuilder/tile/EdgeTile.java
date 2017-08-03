package com.citybuilder.tile;

import com.citybuilder.graphics.Assets;

public class EdgeTile extends Tile {
	
	public EdgeTile(int id) {
		super(Assets.edge, id);
	}
	
	public boolean isEdge(){
		return true;
	}
}
