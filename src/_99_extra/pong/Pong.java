package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {

	}

	int xSpeed = 10;
	int ySpeed = 10;
	int x = 100;
	int y = 100;
	int recx = 50;
	int recy = 0;
	int score = 0;
	boolean movingUp = false;
	boolean movingDown = false;

	@Override
	public void draw() {
		background(80, 80, 0);
		ellipse(x, y, 100, 100); // in draw method
		fill(100, 10, 250); // in draw method
		noStroke(); // in draw method
		x = x + xSpeed;
		y = y + ySpeed;
		if (x > width) {
			xSpeed = -xSpeed;
			if (x < 0) {
				xSpeed = xSpeed * 2;
				score = score + 1;
			}
		}
		if (y > height) {
			ySpeed = -ySpeed;
		}
		if (x < 0) {
			//xSpeed = -xSpeed;
			System.exit(0);
		}
		if (y < 0) {
			ySpeed = -ySpeed;
			System.out.println("top");
			
		}
		if (movingUp == true) {
			recy = recy - 10;

		}
		if (movingDown == true) {
			recy = recy + 10;

		}
		fill(100, 220, 50);
		rect(recx, mouseY, 20, 100);
		if (y> mouseY && y< mouseY +100 && x < recx+20) {
			
			xSpeed=-xSpeed;
			
		}
		if (Y>790){
		int score = score +1;
			
		}

	}

	@Override
	public void keyPressed() {
		// TODO Auto-generated method stub
		super.keyPressed();
		if (keyCode == 87) {

			movingUp = true;

		}
		if (keyCode == 83) {

			movingDown = true;
		}
		System.out.println(keyCode);

	}

	@Override
	public void keyReleased() {
		// TODO Auto-generated method stub
		super.keyReleased();
		if (keyCode == 87) {

			movingUp = false;

		}
		if (keyCode == 83) {

			movingDown = false;
		}
	}

	static public void main(String[] args) {
		PApplet.main(Pong.class.getName());
	}
}
