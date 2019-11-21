package ejerciciosJAVAI;

public class Ejercicio1PROFE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,i=2;
		boolean esPrimoNum1=false, esPrimoNum2=false;
		
		System.out.println("Introduce un número: ");
		num1=Entrada.entero();
		
		System.out.println("Introduce otro número: ");
		num2=Entrada.entero();
		
		if (num2-num1==2) {
			while (num1%i!=0 && i<num1/2)
				i++;

			if (i>=num1/2)
				esPrimoNum1=true;

			i = 2;

			while (num2%i!=0 && i<num2/2)
				i++;

			if (i>=num2/2)
				esPrimoNum2 = true;

			if (esPrimoNum1 && esPrimoNum2)
				System.out.println(num1+" y"+num2+" son primos gemelos");
			else
				System.out.println(num1+" y"+num2+" no son primos gemelos");
		} else
			System.out.println(num1+" y"+num2+" no son primos gemelos");
	}

}
