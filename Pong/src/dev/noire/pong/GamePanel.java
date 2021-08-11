package dev.noire.pong;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(Pong.WIDTH, Pong.HEIGHT));
		this.setMaximumSize(new Dimension(Pong.WIDTH, Pong.HEIGHT));
		this.setMinimumSize(new Dimension(Pong.WIDTH, Pong.HEIGHT));
		this.setFocusable(true);
		this.addKeyListener(this);
		Timer timer = new Timer(20, this);
		
		
		timer.start();
	}
	
	private void checkCollision() {
		
	}
	
	public void update() {
		checkCollision();
		
		
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Pong.WIDTH, Pong.HEIGHT);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}
	
	public void keyPressed(KeyEvent e) {
		
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
	
	public void keyTyped(KeyEvent e) {}

}
