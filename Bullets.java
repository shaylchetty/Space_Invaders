public class Bullets implements SpaceInvaderInterface{

	
	public int x;
	public int y;
	public int velocity;
	
	public Bullets(int x, int y, int v) {
		this.x = x;
		this.y = y;
		velocity = v;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		y -= velocity;
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	
	
}
