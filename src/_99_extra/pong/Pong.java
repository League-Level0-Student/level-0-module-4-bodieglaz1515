package _99_extra.pong;

import javax.swing.JOptionPane;

import processing.core.PApplet;


public class Pong extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
String jimmy;
Double jimmyAsInt;
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		jimmy = JOptionPane.showInputDialog("Put in as a number how hard you want this game to be, 2 is the maximum dificulty and 1.1 is the minimum");
	jimmyAsInt= Double.parseDouble(jimmy);
		if(jimmyAsInt > 2 || jimmyAsInt< 1.1){

			JOptionPane.showMessageDialog(null,"you chose a number higher than 2 or less than 1.1 u monkey TRY AGAIN");
System.exit(0);
		}
	}

	double xSpeed = 10;
	double ySpeed = 10;
	double x = 100;
	double y = 100;
	int recx = 50;
	int recy = 0;
	int score = 0;
	boolean movingUp = false;
	boolean movingDown = false;

	@Override
	public void draw() {

		background(80, 80, 0);
		text(score,100,100);
		ellipse((int)x, (int)y, 100, 100); // in draw method
		fill(100, 10, 250); // in draw method
		noStroke(); // in draw method
		x = x + xSpeed;
		y = y + ySpeed;
	
		if (x > width) {
			xSpeed = -xSpeed*jimmyAsInt;
			if (x < 0) {
				xSpeed = xSpeed * 2;
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
		if (x>800){
			score = 1 + score; 
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
