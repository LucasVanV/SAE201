package SAE_Terraria_m;

public class Robot {
	private Monde monde;
	private int x;
	private int y;
	private boolean nickel;
	private int stockage;
	private int max;
	private int capacite_minage;
	private int numero;
	
	
	public Robot(Monde mond,int i, int j, boolean b, int s, int m, int cm, int n) {
		monde=mond;
		x=i;
		y=j;
		nickel=b;
		stockage=s;
		max=m;
		capacite_minage=cm;
		numero=n;
	}
	
	
	public Monde get_monde() {
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
	

	public int get_stockage() {
		return stockage;
	}
	
	public int get_max() {
		return max;
	}
	
	public int get_cm() {
		return capacite_minage;
	}
	
	public int get_numero() {
		return numero;
	}
	
	public boolean nord() {
		if(x-1>=0) {
			Object s = monde.get_element(x-1, y, 0);
			if(s instanceof Eau) {
				Eau sol = Eau.class.cast(s);
				if(sol.get_eau()==false){
					Object[][][] m = monde.get_matrice();
					m[x-1][y][1]= this;
					m[x][y][1]= null;
					x-=1;
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
		
	
	public boolean sud() {
		if(x+1<=9) {
			Object s = monde.get_element(x+1, y, 0);
			if(s instanceof Eau) {
				Eau sol = Eau.class.cast(s);
				if(sol.get_eau()==false){
					Object[][][] m = monde.get_matrice();
					m[x+1][y][1]= this;
					m[x][y][1]= null;
					x+=1;
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public boolean ouest() {
		if(y-1>=0) {
			Object s = monde.get_element(x, y-1, 0);
			if(s instanceof Eau) {
				Eau sol = Eau.class.cast(s);
				if(sol.get_eau()==false){
					Object[][][] m = monde.get_matrice();
					m[x][y-1][1]= this;
					m[x][y][1]= null;
					y-=1;
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public boolean est() {
		if(y+1<=9) {
			Object s = monde.get_element(x, y+1, 0);
			if(s instanceof Eau) {
				Eau sol = Eau.class.cast(s);
				if(sol.get_eau()==false){
					Object[][][] m = monde.get_matrice();
					m[x][y+1][1]= this;
					m[x][y][1]= null;
					y+=1;
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public boolean mine() {
		Object m = monde.get_element(x, y, 0);
		if (m instanceof Mine) {
			Mine mine = Mine.class.cast(m);
			if (mine.get_nickel()==nickel) {
				if (max-stockage>=capacite_minage) {
					mine.miner(capacite_minage);
					stockage+=capacite_minage;
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public boolean vider() {
		Object e =monde.get_element(x, y+1, 0);
		if(e instanceof Entrepot) {
			Entrepot entr = Entrepot.class.cast(e);
			if(entr.get_nickel()==nickel) {
				entr.ajouter(stockage);
				stockage=0;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}