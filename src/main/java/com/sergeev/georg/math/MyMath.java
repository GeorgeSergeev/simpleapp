package com.sergeev.georg.math;

public class MyMath {
	private int x;
	private int y;
		
	public MyMath(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int calcSum() {
		return x+y;
	}
}
