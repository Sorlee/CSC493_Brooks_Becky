package com.brooks.gdx.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.brooks.gdx.game.Assets;

/**
 * Created by: Becky Brooks
 */
public class Feather extends AbstractGameObject
{
	//Declare variables
	private TextureRegion regFeather;
	public boolean collected;
	
	public Feather()
	{
		init();
	}
	
	//Init function
	private void init()
	{
		dimension.set(0.5f, 0.5f);
		regFeather = Assets.instance.feather.feather;
		//Set bounding box for collision detection
		bounds.set(0, 0, dimension.x, dimension.y);
		collected = false;
	}
	
	//Render function
	public void render (SpriteBatch batch)
	{
		if (collected)
			return;
		TextureRegion reg = null;
		reg = regFeather;
		batch.draw(reg.getTexture(), position.x, position.y, origin.x, origin.y, dimension.x, dimension.y, scale.x, scale.y, rotation, reg.getRegionX(), reg.getRegionY(), reg.getRegionWidth(), reg.getRegionHeight(), false, false);
	}
	
	//GetScore function
	public int getScore()
	{
		return 250;
	}
}
