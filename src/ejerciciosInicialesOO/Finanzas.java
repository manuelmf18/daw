package ejerciciosInicialesOO;

public class Finanzas {
	private  double cambio;

	// CONSTRUCTOR VACIO
public Finanzas() {
		this.cambio = 0.88;

	}

	// CONSTRUCTOR CON PARAMETROS
	public Finanzas(double a) {
		this.cambio = a;
	}
 
	// GETTERS

	public double getA() {
		return cambio;
	}

	

	public double dolaresToEuros(double dinero) {
		return cambio * dinero;
	}

	public double eurosToDolares(double dinero) {
		return dinero / cambio;
	}
	
	
	public static void main(String[] args) {
		 Finanzas f1 = new Finanzas();
		 Finanzas f2 = new Finanzas(0.72);
		 double dinero;
		 
		 System.out.println("Introduzca cuantos dolares quiere cambiar: ");
		 dinero=Entrada.real();
		 double eurosCambio=f2.dolaresToEuros(dinero);
		 System.out.println("El cambio es "+eurosCambio+" euros");
		 
		 
		 
		 

	}
}