package ejerciciosInicialesOO;

public class NumeroTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numero num1 = new Numero(5);
		Numero num2 = new Numero();
		Numero num3 = new Numero(num2);
	
		num1.anyade(3);
		System.out.println("num1 ahora vale "+num1.getValor());
		
		num1.resta(2);
		System.out.println("num1 ahora vale "+num1.getValor());
	
		num2.anyade(2);
		System.out.println("num2 ahora vale "+num2.getValor());
				
		int doble=num2.getDoble();
		System.out.println("El doble de num2 es "+doble);
	
		System.out.println("num2 sigue valiendo: "+num2.getValor());
		
		System.out.println("El triple de num2 es "+num2.getTriple());
		
		System.out.println("num2 sigue valiendo: "+num2.getValor());
	
		System.out.println("La suma de num1 y num2 es "+(num1.getValor()+num2.getValor()));
	}
	

}
