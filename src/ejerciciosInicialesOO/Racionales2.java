package ejerciciosInicialesOO;

public class Racionales2 {
	private int numerador;
	private int denominador;

	// constructor con parámetros
	public Racionales2(int n, int d) {
		this.numerador = n;
		this.denominador = d;
	}
	
	public Racionales2(Racionales2 racOtro)
	{
		this.numerador=racOtro.numerador;
		this.denominador=racOtro.denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}
	
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	private static int mcd(int num1, int num2)
	{
		int t=0;
		
		if(num1<0){
			num1=(-num1);
		}
		
		if(num2<0){
			num2=(-num2);
		}
		
		
		while(num1>0){
			t=num1;
			num1=num2%num1;
			num2=t;
		}
		
		return num2;
	}
	
	private void simplificar()
	{
		int mcd=Racionales2.mcd(this.numerador, this.denominador);
		
		this.numerador=this.numerador/mcd;
		this.denominador=this.denominador/mcd;
	}


	public Racionales2 multiplicacion(Racionales2 racOtro)
	{
		Racionales2 racDevolver=new Racionales2(racOtro);
		
		racDevolver.numerador*=this.numerador;
		racDevolver.denominador*=this.denominador;
		racDevolver.simplificar();
		return racDevolver;
	}
}