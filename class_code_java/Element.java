public abstract class Element {
	protected int x;
	protected int y;
	protected Monde monde;
	
	public Element(int i, int j, Monde m) {
		x=i;
		y=j;
		monde=m;
	}
	
	public Monde get_monde() {
		return this.monde;
	}
  
	public int get_x() {
		return this.x;
	}
  
	public int get_y() {
		return this.y;
	}

}
