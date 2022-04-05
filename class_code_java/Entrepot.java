package SAE_Terraria_m;

public class Entrepot {
	private Monde monde;
    private boolean nickel;
    private int stockage;
    private int numero;
    private int x;
    private int y;

    
    public Entrepot(Monde m, int i, int j, boolean b,int n) {
    	this.monde = m;
        this.nickel = b;
        this.stockage = 0;
        this.numero = n;
        this.x = i;
        this.y = j;
    }
    
    
    public Monde get_monde() {
		return monde;
	}
    
    public int get_x() {
    	return this.x;
    }
    
    public int get_y() {
    	return this.y;
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
    	stockage+=i;
    }
}

