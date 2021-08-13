package dev.noire.pong;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	
	private Ball theBall;
	private Player thePlayer;
	private Computer theComputer;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(Pong.WIDTH, Pong.HEIGHT));
		this.setMaximumSize(new Dimension(Pong.WIDTH, Pong.HEIGHT));
		this.setMinimumSize(new Dimension(Pong.WIDTH, Pong.HEIGHT));
		this.setFocusable(true);
		this.addKeyListener(this);
		Timer timer = new Timer(20, this);
		theBall = new Ball();
		thePlayer = new Player();
		theComputer = new Computer(this);
		timer.start();
	}
	
	private void checkCollision() {
		Rectangle ballRect = theBall.getRect();
		Rectangle playerRect = thePlayer.getRect();
		Rectangle comptuerRect = theComputer.getRect();
		
		//BALL VS PLAYER:
		if(ballRect.intersects(playerRect)) {
			theBall.setX(thePlayer.getX()+thePlayer.getWidth());
			theBall.setDx(-theBall.getDx());
		}
		
		//BALL VS COMPUTER:
		if(ballRect.intersects(comptuerRect)) {
			theBall.setX(theComputer.getX()-theBall.getBallSize());
			theBall.setDx(-theBall.getDx());
		}
	}
	
	public void update() {
		checkCollision();
		theBall.update();
		thePlayer.update();
		theComputer.update();
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Pong.WIDTH, Pong.HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Comic Sans MS", Font.PLAIN, 100));
		g.drawString(""+theBall.getTouchRight(), 200, 200);
		g.drawString(""+theBall.getTouchLeft(), Pong.WIDTH-250, 200);
		theBall.paint(g);
		thePlayer.paint(g);
		theComputer.paint(g);
	}
	
	public Ball getBall() {return theBall;}
	
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			thePlayer.setDy((thePlayer.getY()<0)? 0 : -9.5);
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			thePlayer.setDy((thePlayer.getY()>Pong.HEIGHT-thePlayer.getHeight())? 0 : 9.5);
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			thePlayer.setDy(0);
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			thePlayer.setDy(0);
		}
	}
	
	public void keyTyped(KeyEvent e) {}

}
