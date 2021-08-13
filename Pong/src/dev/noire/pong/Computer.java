package dev.noire.pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Computer {

	private GamePanel game;
	private double x, y, dy;
	private int width, height;
	
	public Computer(GamePanel game) {
		this.game = game;
		width = 20;
		height = 100;
		x = (Pong.WIDTH-width)-50;
		y = (Pong.HEIGHT/2)-(height/2);
		dy = 0;
	}
	
	public void update() {
		y += dy;
		dy = (y +(height/2) > game.getBall().getY())? -8.5 : 8.5;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)x, (int)y, width, height);
	}
	
	public Rectangle getRect() {return new Rectangle((int)x, (int)y, width, height);}

	//GETTERS & SETTERS:
	public GamePanel getGame() {
		return game;
	}

	public void setGame(GamePanel game) {
		this.game = game;
	}

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
