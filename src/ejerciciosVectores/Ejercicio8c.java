package ejerciciosVectores;

public class Ejercicio8c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		
		System.out.println("Introduzca el tamaño del vector: ");
		n=Entrada.entero();
		
		int [] vectorDelDerecho = new int [n];
		
		for(int i=0;i<vectorDelDerecho.length;i++) {
			System.out.println("Introduzca un valor para la posición "+i);
			vectorDelDerecho[i]=Entrada.entero();
		}
		
		System.out.print("\nvectorDelDerecho = {");
		for(int i=0;i<vectorDelDerecho.length;i++) {
			if(i!=0)
				System.out.print(", ");
			System.out.print(vectorDelDerecho[i]);
		}
		System.out.println("}");
		
		int [] vectorDelReves = new int [n];
		
		for (int i=0;i<vectorDelDerecho.length;i++) {
			vectorDelReves[i]=vectorDelDerecho[n-(i+1)];
		}
		
		System.out.print("\nvectorDelReves = {");
		for(int i=0;i<vectorDelReves.length;i++) {
			if(i!=0)
				System.out.print(", ");
			System.out.print(vectorDelReves[i]);
		}
		System.out.println("}");

	}

}
