package ejerciciosVectores;

public class Ejercicio6c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numerosSinRepetir = new int[10];
		int num = 0, j = 0, i=0;
		boolean rep = false;
		
		while(i<numerosSinRepetir.length) {
			num = (int)(Math.random()*50+1);
			j=0;
			rep = false;
			while (i>0 && j<i && rep == false) {
				if (num != numerosSinRepetir[j]) {
					j++;
				}
				else
					rep = true;
			}
			
			if(rep == false) {
				numerosSinRepetir[i] = num;
				i++;
			}			
		}
		System.out.println("El vector es: ");
		for(i = 0; i<numerosSinRepetir.length;i++) {
			System.out.println("La posicion "+i+" es: "+numerosSinRepetir[i]);
		}
	}

}