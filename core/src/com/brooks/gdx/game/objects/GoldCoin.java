package com.brooks.gdx.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.brooks.gdx.game.Assets;
import com.badlogic.gdx.math.MathUtils;

/**
 * Created by: Becky Brooks
 */
public class GoldCoin extends AbstractGameObject
{
	//Declare variables
	private TextureRegion regGoldCoin;
	public boolean collected;
	
	/**
	 * GoldCoin method
	 */
	public GoldCoin()
	{
		init();
	}
	
	/**
	 * Init method
	 */
	private void init ()
	{
		dimension.set(0.5f, 0.5f);
		setAnimation(Assets.instance.goldCoin.animGoldCoin);
		stateTime = MathUtils.random(0.0f, 1.0f);
		//Set bounding box for collision detection
		bounds.set(0, 0, dimension.x, dimension.y);
		collected = false;
	}
	
	/**
	 * Render method
	 */
	public void render (SpriteBatch batch)
	{
		if (collected)
			return;
		TextureRegion reg = null;
		reg = animation.getKeyFrame(stateTime, true);
		batch.draw(reg.getTexture(), position.x, position.y, origin.x, origin.y, dimension.x, dimension.y, scale.x, scale.y, rotation, reg.getRegionX(), reg.getRegionY(), reg.getRegionHeight(), reg.getRegionWidth(), false, false);
	}
	
	/**
	 * GetScore method
	 * @return
	 */
	public int getScore()
	{
		return 100;
	}
}