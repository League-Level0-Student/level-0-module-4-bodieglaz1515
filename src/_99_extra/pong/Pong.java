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
   int  xSpeed=10;
   int ySpeed=10;
int x =100;
int y= 100;
    @Override
    public void draw() {
    	ellipse(x, y,  100 , 100); //in draw method
    	fill(100,10,250); //in draw method
    	stroke(250, 250,10); //in draw method
    x=x+xSpeed;
    y=y+ySpeed;
    if(x > width){
        xSpeed = -xSpeed;
        if(x <0){
            xSpeed = xSpeed*2;
        }
    }
    if(y > height){
        ySpeed = -ySpeed;
    }
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}