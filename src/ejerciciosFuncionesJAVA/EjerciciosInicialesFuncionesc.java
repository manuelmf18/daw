package ejerciciosFuncionesJAVA;


public class EjerciciosInicialesFuncionesc {

	final static double PI=3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int num1=0 , num2=0, max=0;
		
		//Prueba Ejercicio 1
		/*System.out.println("Escribe un n�mero: ");
		num=Entrada.entero();		
		ejecucionModulo(num);*/
		
		//Prueba Ejercicio2
		/*System.out.println("Introduzca un numero");
		num1=Entrada.entero();
		System.out.println("Introduzca otro numero");
		num2=Entrada.entero();
		max=maximo(num1,num2);
		System.out.println("El m�ximo entre "+num1+" y "+num2+" es: "+max);
		*/
		
		//Prueba Ejercicio 3
	/*	int n1=0,n2=0,n3=0;
		System.out.println("Introduce un n�mero:");
		n1=Entrada.entero();
		
		System.out.println("Introduce otro n�mero:");
		n2=Entrada.entero();
		
		System.out.println("Introduce otro n�mero m�s:");
		n3=Entrada.entero();
		
		System.out.println("El m�ximo es: "+maximoTRES(n1,n2,n3));
		*/
		
		//Prueba Ejercicio 4
		//entreNumeros(3,9);
		
		//Prueba Ejercicio 6
		/*double radio=0;
		double altura=0;
		char opc=' ';
		
		System.out.println("�Qu� quieres calcular\na.Area\nv.Volumen");
		opc=Entrada.caracter();
		System.out.println("Dame el radio: ");
		radio=Entrada.real();
		System.out.println("Dame la altura: ");
		altura=Entrada.real();
		
		System.out.println("El resultado es "+areayVolumenCilindro(radio,altura,opc));*/
		
		//Ejercicio 7
		int numer=0;
		
		while(numer<1) {
			System.out.println("Escribe un n�mero entero positivo: ");
			numer=Entrada.entero();			
		}

		if(esPrimo(numer))
			System.out.println("El n�mero es primo");
		else
			System.out.println("El n�mero no es primo");
	}
	
	public static void ejecucionModulo(int n) {
		
		while (n > 0) {
			System.out.println("M�dulo Ejecut�ndose");
			n--;
		}
	}
	
	public static int maximo(int num1, int num2)
	{
		if(num1>num2) {
			return num1;
		}
		else {
			return num2;
		}		
	}
	
	//Ejercicio 3 Fran Dom�nguez
	public static int maximo3(int a, int b, int c) {
		if (a>=b && a>c)
			return a;
		else if (b>a && b>c)
			return b;
		else
			return c;
	}
	
	public static int maximoTRES(int a, int b, int c)
	{
		return maximo(maximo(a,b),c);
	}
	//Ejercicio 4 Miguel �ngel Mart�n
	public static void entreNumeros(int num1, int num2) {

		for (int i = num1; i <= num2; i++) {
			System.out.println("N�mero " + i);
		}
	}

	//Ejercicio 5 Ismael Pozo
	public static int dobleunnumero(int numA) {
		return numA*2;
	}
	
	//Ejercicio 6 Antonio G�mez
	public static double areayVolumenCilindro(double radio, double altura,  char eleccion ) { //ejercicio6
		double area=0;
		double volumen=0;
		if (eleccion=='v') {
			volumen=PI*radio*radio*altura;
			return volumen;
		}
		else if(eleccion=='a'){
			area=2*PI*radio*altura;	
			return area;
		}
		else 
			return -1;
	}
	
	//Ejercicio 7 Miguel �ngel Movilla
	public static boolean esPrimo(int num) {
		int cont = 2;	
		
		while (cont < num) {
			if (num % cont == 0) {
				return false;
			}
			cont++;
		}
		return true;
	}
	
	//Ejercicio 8
	public static int numDivisoresPrimos(int num)
	{
		int cuentaPrimosDivisores=0;
		
		for(int i=1;i<=num;i++)
			if(num%i==0 && esPrimo(i))
				cuentaPrimosDivisores++;
		
		return cuentaPrimosDivisores;
	}

}