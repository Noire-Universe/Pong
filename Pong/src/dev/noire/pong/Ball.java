package dev.noire.pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {

	private double x, y, dx, dy;
	private int touchLeft, touchRight, ballSize;
	
	public Ball() {
		touchLeft = 0;
		touchRight = 0;
		ballSize = 20;
		
		x = (Pong.WIDTH/2)-(ballSize/2);
		y = (Pong.HEIGHT/2)-(ballSize/2);
		
		dx = 10;
		dy = 10;
		
	}
	
	public void update() {
		x += dx;
		y += dy;
		
		if(x<0) {
			x = (Pong.WIDTH/2)-(ballSize/2);
			y = (Pong.HEIGHT/2)-(ballSize/2);
			touchLeft++;
			dx = -dx;
		}
		
		if(x>Pong.WIDTH-ballSize) {
			x = (Pong.WIDTH/2)-(ballSize/2);
			y = (Pong.HEIGHT/2)-(ballSize/2);
			touchRight++;
			dx = -dx;
		}
		
		dy = (y<0||y>Pong.HEIGHT-ballSize)? -dy : dy;
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval((int)x, (int)y, ballSize, ballSize);
	}
	
	public Rectangle getRect() {return new Rectangle((int)x, (int)y, ballSize, ballSize);}

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

	public double getDx() {
		return dx;
	}

	public void setDx(double dx) {
		this.dx = dx;
	}

	public double getDy() {
		return dy;
	}

	public void setDy(double dy) {
		this.dy = dy;
	}

	public int getTouchLeft() {
		return touchLeft;
	}

	public void setTouchLeft(int touchLeft) {
		this.touchLeft = touchLeft;
	}

	public int getTouchRight() {
		return touchRight;
	}

	public void setTouchRight(int touchRight) {
		this.touchRight = touchRight;
	}

	public int getBallSize() {
		return ballSize;
	}

	public void setBallSize(int ballSize) {
		this.ballSize = ballSize;
	}
	
	
}
