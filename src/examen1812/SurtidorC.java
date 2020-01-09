package examen1812;

public class SurtidorC {

		private static double gasolina=0;
		private static double litrosGasolina=0;
		private static double gasolinaSuper=0;
		private static double litrosGasolinaSuper=0;
		private static double gasoil=0;
		private static double litrosGasoil=0;
		private static double gasoilPlus=0;
		private static double litrosGasoilPlus=0;
		private static final int CAPACIDAD=5000;
		

		public static void main(String[] args) {
		
			System.out.println("Rellenando surtidores...\n");
			rellenarSurtidor("gasolina",100.15);
			rellenarSurtidor("gasolinaSuper",200.75);
			rellenarSurtidor("gasoil", 182.25);
			rellenarSurtidor("gasoilPlus", 20.10);
			System.out.println("Mostrando surtidores...");
			System.out.println("El surtidor de gasolina tiene "+mostrarContenido("gasolina")+" litros");
			System.out.println("El surtidor de gasolina Super tiene "+litrosGasolinaSuper+" litros");
			System.out.println("El surtidor de gasoil tiene "+litrosGasoil+" litros");
			System.out.println("El surtidor de gasoil Plus tiene "+litrosGasoilPlus+" litros\n");
			System.out.println("Cambiando precios...");
			cambiarPrecio();
			cambiarPrecio();
			cambiarPrecio();
			cambiarPrecio();
			System.out.println("\nMostrando precios...");
			System.out.println("La gasolina está a "+gasolina+" euros");
			System.out.println("La gasolina Super está a "+gasolinaSuper+" euros");
			System.out.println("El gasoil está a "+gasoil+" euros");
			System.out.println("El gasoil Plus está a "+gasoilPlus+" euros\n");
			ponerCombustible(30, "gasoil");
			System.out.println("El surtidor de gasoil tiene "+redondea(litrosGasoil)+" litros\n");
			ponerCombustible(50, "gasoilPlus");
			System.out.println("El surtidor de gasoil Plus tiene "+redondea(litrosGasoilPlus)+" litros\n");
			
		}
		
		
		private static double mostrarContenido(String surtidor) {
			double litros=0;
			if (surtidor.compareToIgnoreCase("gasolina")==0) {
				litros=litrosGasolina;
			}
			if (surtidor.compareToIgnoreCase("gasolinaSuper")==0) {
				litros=litrosGasolinaSuper;
			}
			if (surtidor.compareToIgnoreCase("gasoil")==0) {
				litros=litrosGasoil;
			}
			if (surtidor.compareToIgnoreCase("gasoilPlus")==0) {
				litros=litrosGasoilPlus;
			}
			return redondea(litros);
		}
		
		private static double redondea(double num) {
			int aux=100;
			double res=num;
			res = Math.round(res*aux);
			res = res/aux;
			return res;
		}
		
		private static double mostrarPrecio(String surtidor) {
			double res=0;
			if (surtidor.compareToIgnoreCase("gasolina")==0) {
				res=gasolina;
			}
			if (surtidor.compareToIgnoreCase("gasolinaSuper")==0) {
				res=gasolinaSuper;
			}
			if (surtidor.compareToIgnoreCase("gasoil")==0) {
				res=gasoil;
			}
			if (surtidor.compareToIgnoreCase("gasoilPlus")==0) {
				res=gasoilPlus;
			}
			res = Math.round(res*1000);
			res = res/1000;
			return res;
		}
		
		private static Double rellenarSurtidor(String surtidor, Double litros) {
			double res=-1;
			if (litros>=0) {
				if (surtidor.compareToIgnoreCase("gasolina")==0 && litrosGasolina+litros<=CAPACIDAD) {
					litrosGasolina+=litros;
					res=litrosGasolina;
				}
				if (surtidor.compareToIgnoreCase("gasolinaSuper")==0 && litrosGasolinaSuper+litros<=CAPACIDAD) {
					litrosGasolinaSuper+=litros;
					res=litrosGasolinaSuper;
				}
				if (surtidor.compareToIgnoreCase("gasoil")==0 && litrosGasoil+litros<=CAPACIDAD) {
					litrosGasoil+=litros;
					res=litrosGasoil;
				}
				if (surtidor.compareToIgnoreCase("gasoilPlus")==0 && litrosGasoilPlus+litros<=CAPACIDAD) {
					litrosGasoilPlus+=litros;
					res=litrosGasoilPlus;
				}
			}
			return res;
		}
		
		private static boolean vaciarSurtidor(String surtidor, Double litros) {
			boolean res=false;
			if (litros>=0) {
				if (surtidor.compareToIgnoreCase("gasolina")==0 && litrosGasolina-litros>=0) {
					litrosGasolina-=litros;
					res=true;
				}
				if (surtidor.compareToIgnoreCase("gasolinaSuper")==0 && litrosGasolinaSuper-litros>=0) {
					litrosGasolinaSuper-=litros;
					res=true;
				}
				if (surtidor.compareToIgnoreCase("gasoil")==0 && litrosGasoil-litros>=0) {
					litrosGasoil-=litros;
					res=true;
				}
				if (surtidor.compareToIgnoreCase("gasoilPlus")==0 && litrosGasoilPlus-litros>=0) {
					litrosGasoilPlus-=litros;
					res=true;
				}
			}
			return res;
		}
		
		private static void cambiarPrecio() {
			String surtidor;
			double precio;
			System.out.println("Introduzca el combustible al que le vamos a cambiar el precio:");
			surtidor=Entrada.cadena();
			System.out.println("Introduzca el nuevo precio");
			precio=Entrada.real();
			if (surtidor.compareToIgnoreCase("gasolina")==0 || surtidor.compareToIgnoreCase("gasolinaSuper")==0
					|| surtidor.compareToIgnoreCase("gasoil")==0 || surtidor.compareToIgnoreCase("gasoilPlus")==0) {
				if (surtidor.compareToIgnoreCase("gasolina")==0) {
					gasolina=precio;
				}
				if (surtidor.compareToIgnoreCase("gasolinaSuper")==0) {
					gasolinaSuper=precio;
				}
				if (surtidor.compareToIgnoreCase("gasoil")==0) {
					gasoil=precio;
				}
				if (surtidor.compareToIgnoreCase("gasoilPlus")==0) {
					gasoilPlus=precio;
				}
			} else {
				System.out.println("El surtidor que ha introducido no existe o no está bien escrito");
			}
			
		}
		
		private static void ponerCombustible(int dinero, String combustible) {
			int exit=0;
			boolean aux=true;
			double precio=mostrarPrecio(combustible);
			double quitar=0.5/precio;
			double ini=0;
			double litros=0;
			double dineroReal = dinero;
			System.out.println("Coche repostando "+dinero+" euros de "+combustible+"...");
			System.out.println("euros\t"+"\tlitros");
			while(ini<=dineroReal && exit==0) {
				ini+=0.5;
				if (ini<=dineroReal) {
					litros=ini/precio;
					aux=vaciarSurtidor(combustible, quitar);
					if (!aux) {
						exit++;
						System.out.println("El surtidor no puede seguir proveyendo");
					} else {
						System.out.println(ini+"\t"+"\t"+redondea(litros));
					}
				}
			}
		}
		

	}

