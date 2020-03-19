package ejemplo00;

import ejerciciosInicialesOO.Numero;

public class Coche {
	private String matricula;
	private String marca;
	private String color;
	private double kilometraje;
	private double cantidadGasolina;
	private Numero num_plazas;
	private static int numero_coches=0;
		
	//constructor vacío
	public Coche()
	{
		matricula=new String("");
		marca=new String("");
		color=new String("");
		kilometraje=0.0;
		cantidadGasolina=0;
		num_plazas=new Numero(5);
	}
	
	//constructor con parámetros
		public Coche(String mat, String marca, String color, double kilometraje, double cantidadGasolina,int plazas)
		{
			matricula=mat.toUpperCase();
			this.marca=marca.toUpperCase();
			this.color=color.toUpperCase();
			this.kilometraje=kilometraje;
			this.cantidadGasolina=cantidadGasolina;
			num_plazas=new Numero(plazas);
		}
		
		//constructor copia
		public Coche(Coche cocheCopia)
		{
			this.matricula=cocheCopia.matricula;
			this.marca=cocheCopia.marca;
			this.color=cocheCopia.color;
			this.kilometraje=cocheCopia.kilometraje;
			this.num_plazas=cocheCopia.num_plazas;
		}
		
		//getters
		public String getMatricula()
		{
			return matricula;
		}
		
		public String getMarca() {
			return marca;
		}
		
		public String getColor()
		{
			return color;
		}
		
		public double getKilometraje() {
			return kilometraje;
		}
		
		public double getCantidadGasolina() {
			return cantidadGasolina;
		}

		public Numero getNum_plazas() {
			return num_plazas;
		}
		
		public static int getNumero_coches() {
			return numero_coches;
		}
		
		//setters
	public void setMatricula(String nuevaMatricula)
		{
			matricula=nuevaMatricula.toUpperCase();
		}		

		public void setMarca(String marca) {
			this.marca = marca;
		}		
		
		public void setColor(String color)
		{
			switch(color.toLowerCase()) {
				case "rojo":
				case "blanco":
				case "azul":
				case "negro":
					this.color=color.toUpperCase();
					break;
				default:
					this.color="blanco";					
			}
		}		
		
		public void setKilometraje(double kilometraje) {
			this.kilometraje = kilometraje;
		}		

		public void setNum_plazas(int num_plazas) {
			this.num_plazas.setValor(num_plazas);
		}

		public static void setNumero_coches(int numero_coches) {
			Coche.numero_coches = numero_coches;
		}
		
		public boolean hacerViaje(double numKilometrosViaje)
		{
			if(this.cantidadGasolina<numKilometrosViaje*6/100)
				return false;
			else {
				this.kilometraje+=numKilometrosViaje;
				cantidadGasolina-=numKilometrosViaje*6/100;
				return true;
			}
		}
		
}