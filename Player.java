public class Player extends SpaceInvaderAbstract{

	
	private int x;

	public Player() {
		x = 0;
	}

	@Override
	public void moveX(int x) {
		// TODO Auto-generated method stub
		this.x = x;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public boolean collision(Bullets b, int x, int y) {
		// TODO Auto-generated method stub
		
		return false;
		
	}
	
	
}
