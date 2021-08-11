package dev.noire.pong;

import javax.swing.JFrame;

public class Pong extends JFrame{

	public static final int WIDTH = 1024, HEIGHT = 768;
	
	public static void main(String[] args) {
		new Pong();
	}
	
	public Pong() {
		this.setTitle("Pong Demo");
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.add(new GamePanel());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
