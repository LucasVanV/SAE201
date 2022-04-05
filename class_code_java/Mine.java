package SAE_Terraria_m;

public class Mine {
	private int monde;
	private int x;
	private int y;
	private boolean nickel;
	private int quantite;
	private int numero;
	
	
	public Mine(Monde m,int i,int j, boolean b,int q,int n) {
		monde=i;
		x=i;
		y=j;
		nickel=b;
		quantite=q;
		numero=n;
	}
	
	
	public int get_monde() {
		return monde;
	}
	
	public int get_x() {
		return x;
	}
	

	public int get_y() {
		return y;
	}
	
	public boolean get_nickel() {
		return nickel;
	}
	

	public int get_quantite() {
		return quantite;
	}
	
	public int get_numero() {
		return numero;
	}
	
	public void miner(int i) {
		quantite-=i;
	}
	
}