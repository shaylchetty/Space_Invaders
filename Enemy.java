public class Enemy extends SpaceInvaderAbstract{

	
	public static int xVelocity = 1;
	public static int yVelocity = 10;
	
	public int x;
	
	public int y;
	@Override
	public void moveX(int x) {
		// TODO Auto-generated method stub
		this.x += x;
	}
	
	public void moveY() {
		y += yVelocity;
	}
	
	public boolean check() {
		if (x > 870) {
			return false;

		}
		else if (x < 30) {
			return false;
		}
		else{
			return true;
		}
		
	}
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getxVelocity() {
		return xVelocity;
	}

	public void setxVelocity(int xVelocity) {
		Enemy.xVelocity = xVelocity;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean collision(Bullets b, int x, int y) {
		// TODO Auto-generated method stub
		
		return false;
		
	}
	
	

}
