package ejerciciosInicialesOOtros;

import ejerciciosInicialesOO.Carta;

public class Baraja {

	public static void main(String[] args) {
		Carta[][] baraja = new Carta[4][12];

		for (int i = 0; i < baraja.length; i++) {
			for (int j = 0; j < baraja[i].length; j++) {

				if (i == 0)
					baraja[i][j] =new Carta(j+1,"oros");
				if (i == 1) 
					baraja[i][j] =new Carta(j+1,"copas");
				if (i == 2) 
					baraja[i][j] =new Carta(j+1,"bastos");
				if (i == 3)
					baraja[i][j] =new Carta(j+1,"espadas");
				}
			}
		
			muestraCartaAleatoria(baraja);
		}
	
public static void muestraCartaAleatoria(Carta[][]mat) {
		
		int i= (int)(Math.random()*mat.length);
		int j= (int) (Math.random()*mat[i].length);
		
		System.out.println("La carta es el "+mat[i][j].getNumero()+" de "+mat[i][j].getPalo());		
		
	}
	
	

		

}