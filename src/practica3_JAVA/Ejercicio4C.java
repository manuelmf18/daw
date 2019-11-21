package practica3_JAVA;

public class Ejercicio4C {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		
		while(num%2==0 || num<7){
			System.out.println("Introduzca un número impar mayor de 6: ");
			num=Entrada.entero();
		}
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				if(j==(num/2)+1 || i==(num/2)+1) //cruz
					System.out.print("* ");
				else if (i==((num/2+1)-j+1) || 
						(i==num/2+j) || 
						(j==num/2+i) || 
						(j==(num/2+1)+(num-i)))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}		
	}
}
