public class Entrepot extends Element implements Comparable<Entrepot>{
	private boolean nickel;
	private int stockage;
	private int numero;
	
	
	public Entrepot(Monde m, int i, int j, boolean b, int n) {
		super(i,j,m);
		this.nickel = b;
		this.stockage = 0;
		this.numero = n;
	}

	
	public boolean get_nickel() {
		return this.nickel;
	}
  
	public int get_stockage() {
		return this.stockage;
	}
  
	public int get_numero() {
		return this.numero;
	}
  
	public void ajouter(int i) {
		this.stockage += i;
	}
  
	@Override
	public int compareTo(Entrepot e) {
		return (this.numero - e.numero);
	}
}
