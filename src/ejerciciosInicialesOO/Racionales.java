package ejerciciosInicialesOO;

public class Racionales {
	private int numerador;
	private int denominador;

	// constructor con parámetros
	public Racionales(int n, int d) {
		this.numerador = n;
		this.denominador = d;
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
		int mcd=Racionales.mcd(this.numerador, this.denominador);
		
		this.numerador=this.numerador/mcd;
		this.denominador=this.denominador/mcd;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public void suma(Racionales rac) {
		this.numerador = this.numerador * rac.denominador + rac.numerador * this.denominador;
		this.denominador = this.denominador * rac.denominador;
		this.simplificar();
	}
	
	public void resta(Racionales rac) {
		this.numerador = this.numerador * rac.denominador - rac.numerador * this.denominador;
		this.denominador = this.denominador * rac.denominador;
		this.simplificar();
	}
	
	public void multiplicacion(Racionales rac) {
		this.numerador = this.numerador * rac.numerador;
		this.denominador = this.denominador * rac.denominador;
		this.simplificar();
	}
	
	public void division(Racionales rac) {
		this.numerador = this.numerador * rac.denominador;
		this.denominador = this.denominador * rac.numerador;
		this.simplificar();
	}
}