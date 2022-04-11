public class Eau extends Element{
	private boolean eau;

	
	public Eau(Monde m, int i, int j, boolean b) {
		super(i,j,m);
		this.eau = b;
	}
  
	
	public boolean get_eau() {
		return this.eau;
	}
}
