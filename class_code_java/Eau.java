package SAE_Terraria_m;


public class Eau {
	private Monde monde;
	private int x;
	private int y;
	private boolean eau;
	
	
	public Eau(Monde m,int i, int j, boolean b) {
		monde=m;
		x=i;
		y=j;
		eau= b;
	}
	
	public Monde get_monde(){
		return monde;
	}
	
	public int get_x() {
		return x;
	}

	public int get_y() {
		return y;
	}
	
	public boolean get_eau() {
		return eau;
	}
	
}