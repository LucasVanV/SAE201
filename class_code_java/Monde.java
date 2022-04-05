package SAE_Terraria_m;
import java.util.Random;

public class Monde {
	private int id_monde;
	private Object[][][] matrice;
	
	
	public Monde(int i) {
		id_monde=i;
		matrice = new Object[10][10][2];
	}
	
	
	public int get_monde() {
		return id_monde;
	}
	
	public Object[][][] get_matrice(){
		return matrice;
	}
	
	public Object get_element(int i, int j, int k) {
		return matrice[i][j][k];
	}
		
	
	public void creer_monde() {
		int e=1;
		int r=1;
		int m=1;
		Random random = new Random();
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				boolean b=false;
				while (b=false) {
					int ran = random.nextInt(50 + 1) + 1;
					if (ran<=25) {
						matrice[i][j][0] = new Eau(this,i,j,false);
						b=true;
					}else if (25<ran & ran<=30 & e<=4) {
						if (e % 2  == 0) {
							matrice[i][j][0] = new Entrepot(this,i,j,false,e);
						}else {
							matrice[i][j][0] = new Entrepot(this,i,j,true,e);
						e+=1;
						b=true;
						}
					}else if (30<ran & ran<=40) {
						matrice[i][j][0] = new Eau(this,i,j,true);
						matrice[i][j][1] = new Eau(this,i,j,true);
						b=true;
					}else if (40<ran & ran<=45 & m<=4) {
						int q = random.nextInt(100 + 50) + 50;
						if (m % 2  == 0) {
							matrice[i][j][0] = new Mine(this,i,j,false,q,m);
						}else {
							matrice[i][j][0] = new Mine(this,i,j,true,q,m);
						m+=1;
						b=true;
						}
					}else if (ran>45 & r<=5){
						int max = random.nextInt(9 + 5) + 5;
						int cm = random.nextInt(3 + 1) + 1;
						matrice[i][j][0] = new Eau(this,i,j,false);
						if (r % 2  == 0) {
							matrice[i][j][1] = new Robot(this,i,j,false,0,max,cm,m);
						}else {
							matrice[i][j][1] = new Robot(this,i,j,true,0,max,cm,m);
						r+=1;
						b=true;
						}
					}
				}
			}
		}
	}
	
	public void afficher_console() {
		for(int i=0; i<matrice.length; i++) {
			System.out.println("  |  "+i);
		}
		for(int i=0; i<matrice.length; i++) {
			
			for(int j=0; j<matrice[0].length; j++) {
				for(int k=0; k<matrice[0][0].length; k++) {
					
				}
			}
		}
		
	}
	
}





