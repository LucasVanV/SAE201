public class Mine extends Element implements Comparable<Mine>{
	private boolean nickel;
	private int quantite;
	private int max;
	private int numero;
  
	
	public Mine(Monde m, int i, int j, boolean b, int q, int n) {
		super(i,j,m);
		this.nickel = b;
		this.quantite = q;
		this.max = q;
		this.numero = n;
	}

  
	public boolean get_nickel() {
		return nickel;
	}
  
	public int get_quantite() {
		return quantite;
	}
  
	public int get_max() {
		return max;
	}
  
	public int get_numero() {
		return numero;
	}
  
	public void miner(int i) {
		if(quantite - i >=0) {
			quantite -= i;
		}else {
			quantite=0;
		}
	}
  
	@Override
	public int compareTo(Mine m) {
		return (numero - m.numero);
	}
}
