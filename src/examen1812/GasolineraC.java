package examen1812;

public class GasolineraC {
	private static final double CAPACIDAD_SURTIDORES=5000;
	
	private static double precioGasolina=1.56, precioGasolinaSuper=1.62, precioGasoil=1.29, precioGasoilPlus=1.35;
	private static double litrosGasolina=150, litrosGasolinaSuper=4900, litrosGasoil=780, litrosGasoilPlus=1050;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char op=' ';
		String comb=new String("");
		double litros=0;
		int cantidad=0;
		
		System.out.println("BIENVENIDO A GASOLINERA COMBUSTIBLES & COMESTIBLES");
			
		
		while(op!='s') {
			System.out.println("\n¿Qué quiere hacer?"
					+ "\na.Mostrar litros de surtidor"
					+ "\nb.Mostrar precio de surtidor"
					+ "\nc.Rellenar surtidor"
					+ "\nd.Cambiar precio de combustible"
					+ "\ne.Poner combustible"
					+ "\ns.Salir");
			op=Entrada.caracter();
			
			switch(op) {
				case 'a':
					System.out.println("Introduzca el combustible para el que \nquiere saber los litros disponibles");
					comb=Entrada.cadena();
					mostrarLitros(comb);
					break;
				case 'b':
					System.out.println("Introduzca el combustible para el que \nquiere saber el precio");
					comb=Entrada.cadena();
					System.out.println("El precio del combustible "+comb+" es: "+Math.rint(devolverPrecio(comb)*100)/100);
					break;
				case 'c':
					System.out.println("Introduzca el combustible para el que \nquiere rellenar el surtidor");
					comb=Entrada.cadena();
					System.out.println("Introduzca los litros a rellenar en el surtidor: ");
					litros=Entrada.real();
					if(rellenarSurtidor(comb,litros))
						System.out.println("Surtidor relleno con éxito");
					else
						System.out.println("No se pudo rellenar el surtidor con los litros indicados");
					break;
				case 'd':
					cambiarPrecio();
					break;
				case 'e':
					System.out.println("Introduzca el combustible con el que \nquiere surtir al vehículo");
					comb=Entrada.cadena();
					System.out.println("Introduzca la cantidad a surtir: ");
					cantidad=Entrada.entero();
					
					System.out.println("Se han dispensado "+ponerCombustible(comb,cantidad)+" de "+comb);
					break;
				case 's':
					System.out.println("¡Hasta la próxima!");
					break;
				default:
					System.out.println("Opción incorrecta...");
						
			}
		}
	}
	
	public static void mostrarLitros(String tipoCombustible)
	{
		if(tipoCombustible.equalsIgnoreCase("gasolina"))
			System.out.println("El surtidor de "+tipoCombustible+" tiene "+Math.rint(litrosGasolina*100)/100+" litros.");
		else if(tipoCombustible.equalsIgnoreCase("gasolina super"))
			System.out.println("El surtidor de "+tipoCombustible+" tiene "+Math.rint(litrosGasolinaSuper*100)/100+" litros.");
		else if(tipoCombustible.equalsIgnoreCase("gasoil"))
			System.out.println("El surtidor de "+tipoCombustible+" tiene "+Math.rint(litrosGasoil*100)/100+" litros.");
		else if(tipoCombustible.equalsIgnoreCase("gasoil plus"))
			System.out.println("El surtidor de "+tipoCombustible+" tiene "+Math.rint(litrosGasoilPlus*100)/100+" litros.");
		else
			System.out.println("El combustible indicado no existe");
	}
	
	public static double devolverPrecio(String tipoCombustible)
	{	
		switch (tipoCombustible.toLowerCase())
		{
			case "gasolina": return precioGasolina;
			case "gasolina super": return precioGasolinaSuper;
			case "gasoil": return precioGasoil;
			case "gasoil plus": return precioGasoilPlus;
			default: return -1;
		}
	}
	
	public static boolean rellenarSurtidor(String tipoCombustible, double litros)
	{
		if (tipoCombustible.compareToIgnoreCase("gasolina")==0 && litrosGasolina+litros<=CAPACIDAD_SURTIDORES) {
			litrosGasolina+=litros;
			return true;
		}
		if (tipoCombustible.compareToIgnoreCase("gasolina Super")==0 && litrosGasolinaSuper+litros<=CAPACIDAD_SURTIDORES) {
			litrosGasolinaSuper+=litros;
			return true;
		}
		if (tipoCombustible.compareToIgnoreCase("gasoil")==0 && litrosGasoil+litros<=CAPACIDAD_SURTIDORES) {
			litrosGasoil+=litros;
			return true;
		}
		if (tipoCombustible.compareToIgnoreCase("gasoil Plus")==0 && litrosGasoilPlus+litros<=CAPACIDAD_SURTIDORES) {
			litrosGasoilPlus+=litros;
			return true;
		}	
		return false;
	}
	
	public static void cambiarPrecio()
	{
		System.out.println("Indica el combustible al que quiere cambiar el precio: ");
		String tipoCombustible=Entrada.cadena();
		
		if (tipoCombustible.compareToIgnoreCase("gasolina")==0) {
			System.out.println("Indique el nuevo precio del combustible: ");
			double precioCombustible=Entrada.real();
			precioGasolina=precioCombustible;
			System.out.println("Precio de "+tipoCombustible+" cambiado con éxito, el nuevo precio es de "+precioCombustible);
		}
		else if (tipoCombustible.compareToIgnoreCase("gasolina super")==0) {
			System.out.println("Indique el nuevo precio del combustible: ");
			double precioCombustible=Entrada.real();
			precioGasolinaSuper=precioCombustible;
			System.out.println("Precio de "+tipoCombustible+" cambiado con éxito, el nuevo precio es de "+precioCombustible);
		}
		else if (tipoCombustible.compareToIgnoreCase("gasoil")==0) {
			System.out.println("Indique el nuevo precio del combustible: ");
			double precioCombustible=Entrada.real();
			precioGasoil=precioCombustible;
			System.out.println("Precio de "+tipoCombustible+" cambiado con éxito, el nuevo precio es de "+precioCombustible);
		}
		else if (tipoCombustible.compareToIgnoreCase("gasoil plus")==0) {
			System.out.println("Indique el nuevo precio del combustible: ");
			double precioCombustible=Entrada.real();
			precioGasoilPlus=precioCombustible;
			System.out.println("Precio de "+tipoCombustible+" cambiado con éxito, el nuevo precio es de "+precioCombustible);
		}			
		else
			System.out.println("El combustible indicado no existe");
	}
	
	public static boolean vaciarSurtidor(String tipoCombustible, double litros)
	{
		if (tipoCombustible.compareToIgnoreCase("gasolina")==0 && litrosGasolina-litros>=0) {
			litrosGasolina-=litros;
			return true;
		}
		if (tipoCombustible.compareToIgnoreCase("gasolina super")==0 && litrosGasolina-litros>=0) {
			litrosGasolinaSuper-=litros;
			return true;
		}
		if (tipoCombustible.compareToIgnoreCase("gasoil")==0 && litrosGasolina-litros>=0) {
			litrosGasoil-=litros;
			return true;
		}
		if (tipoCombustible.compareToIgnoreCase("gasoil plus")==0 && litrosGasolina-litros>=0) {
			litrosGasoilPlus-=litros;
			return true;
		}	
		return false;
	}
	
	public static double ponerCombustible(String tipoCombustible, int dinero)
	{
		double precioCombustible=devolverPrecio(tipoCombustible);
		int i=1;
		double cantidadLitros=0;
		if(precioCombustible==-1)
			return dinero;
		else
		{
			System.out.println("Coche repostando "+dinero+" euros de "+tipoCombustible+"...");
			System.out.println("euros\t"+"\tlitros");
			
			while(i<=dinero && vaciarSurtidor(tipoCombustible,1/precioCombustible))
			{
				cantidadLitros+=1/precioCombustible;
				System.out.println(i+"\t"+"\t"+Math.rint(cantidadLitros*100)/100);
				i++;
			}
			
			return i-1;
		}		
	}	
}
