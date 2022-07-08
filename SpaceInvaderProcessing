import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import processing.core.PImage;

public class SpaceInvaderProcessing extends PApplet {

	PImage me;
	PImage back;
	PImage enemy;
	public List<ArrayList<Enemy>> bb = new ArrayList<>();
	public ArrayList<Bullets> shots = new ArrayList<Bullets>();
	public int time = 0;
	private Player P1;
	public boolean gameOver = false;
	public int Enemycount = 24;
	
	public static void main(String[] args) {
		PApplet.main("SpaceInvaderProcessing");
	}
	
	
	public void settings()
	{
		size(900, 650);
	}
	
	public void setup()
	{

		background(255);
		noCursor();
		frameRate(20);
		P1 = new Player();
		me = loadImage("cannon.png");
		me.resize(40,40);
		back = loadImage("background.jpg");
		back.resize(900,650);
		enemy = loadImage("Enemy.png");
		enemy.resize(40,40);
		createEnemies();
		
		
	}
	
	public void draw() {
		if(gameOver == false) {
			image(back,0,0);
			fill(0);
			updatePlayer();
			updateShots();
			updateEnemies();
			enemiesShoot();
			//System.out.println(bb.get(2).size());
		}
	}
	
	public void mousePressed()
	{
		Bullets b = new Bullets(mouseX, 545, 5);
		shots.add(b);
	}
	
	public void updatePlayer() {
		P1.setX(mouseX);
		image(me, mouseX-18,550);
		
	}
	
	public void updateShots() {
		if (shots.size() > 0)
		{    
			for(int i = shots.size()-1; i > 0; i--)       
			{   
				fill(255);         
				shots.get(i).move();         
				rect((float)shots.get(i).getX(), (float)shots.get(i).getY(), 3, 10); 
				if (shots.get(i).getY() > 650 || shots.get(i).getY() < 0) {
					shots.remove(i);
				}
				if(P1.collision(shots.get(i), P1.getX(), 550)) {
					gameOver = true;
				}
				
			}        
        }       
    }
	
	public void createEnemies() {
		
		ArrayList<Enemy> b2 = new ArrayList<Enemy>(6);
		for(int i = 0; i < 3; i++) {
			bb.add(b2);
		}
		for(int i = 0; i < bb.size(); i++) {
			for(int j = 0; j < 8; j++) {
				bb.get(i).add(j, new Enemy(70*j+120,50*i));
			}
		}

	}
	
	public void updateEnemies() {
		for(int i = 0; i < bb.size(); i++) {
			for(int j = 0; j < bb.get(i).size(); j++) {
				image(enemy, bb.get(i).get(j).getX(),bb.get(i).get(j).getY());
				bb.get(i).get(j).moveX(bb.get(i).get(j).getxVelocity());
				if(bb.get(i).get(j).check() == false) {
					Enemy.xVelocity *= -1;
					for(int a = 0; a < bb.size(); a++) {
						for(int b = 0; b < bb.get(a).size(); b++) {
							bb.get(a).get(b).moveY();
						}
					}				
				}
			}
		}	
	}

	public void enemiesShoot() {
		time++;	
		if (time > 10) {
			int row = (int)(Math.random()*bb.size());
			int col = (int)(Math.random()*bb.get(row).size());
			Enemy A = bb.get(row).get(col);
			shots.add(new Bullets(A.getX(), A.getY(), -5));		
			time = 0;
		}			
	}
	


}
