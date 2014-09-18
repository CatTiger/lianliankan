package com.example.lianlian.object;

import android.content.Context;

public class GameConf {

	public static final int PIECE_WIDTH = 40;
	public static final int PIECE_HEIGHT = 40;

	public static int DEFAULT_TIME = 100;

	private int xSize;
	private int ySize;

	private int beginImageX;
	private int beginImageY;

	// 记录游戏时间
	private long gameTime;

	private Context context;

	public GameConf(int xSize, int ySize, int beginImageX, int beginImageY,
			long gameTime, Context context) {
		super();
		this.xSize = xSize;
		this.ySize = ySize;
		this.beginImageX = beginImageX;
		this.beginImageY = beginImageY;
		this.gameTime = gameTime;
		this.context = context;
	}

	public int getxSize() {
		return xSize;
	}

	public void setxSize(int xSize) {
		this.xSize = xSize;
	}

	public int getySize() {
		return ySize;
	}

	public void setySize(int ySize) {
		this.ySize = ySize;
	}

	public int getBeginImageX() {
		return beginImageX;
	}

	public void setBeginImageX(int beginImageX) {
		this.beginImageX = beginImageX;
	}

	public int getBeginImageY() {
		return beginImageY;
	}

	public void setBeginImageY(int beginImageY) {
		this.beginImageY = beginImageY;
	}

	public long getGameTime() {
		return gameTime;
	}

	public void setGameTime(long gameTime) {
		this.gameTime = gameTime;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

}
