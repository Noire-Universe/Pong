package dev.noire.pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player {

	private double x, y, dy;
	private int width, height;
	
	public Player() {
		width = 20;
		height = 100;
		
		x = 50;
		y = (Pong.HEIGHT/2)-(height/2);
		
		dy = 0;
	}
	
	public void update() {
		y += dy;
		
		if(y<0)
			y=0;
		if(y>Pong.HEIGHT-height)
			y=Pong.HEIGHT-height;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)x, (int)y, width, height);
	}
	
	public Rectangle getRect() {return new Rectangle((int)x, (int)y, width, height);}

	//GETTERS & SETTERS:
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDy() {
		return dy;
	}

	public void setDy(double dy) {
		this.dy = dy;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
