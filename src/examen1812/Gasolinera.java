package examen1812;

public class Gasolinera {

	public final static int CAPACIDAD_SURTIDORES = 5000;
	public static double precioGasolina = 1.56, precioGasolinaSuper = 1.62, precioGasoil = 1.29,
			precioGasoilPlus = 1.35;
	public static double litrosGasolina = 150, litrosGasolinaSuper = 4900, litrosGasoil = 780, litrosGasoilPlus = 1050;
	public static String tipoCombustible = new String("gasolina");
	public static int litrosAnadeVehiculo = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int litrosAnadeSurtidor = 0, cont = 0, dinero = 0;
		String menu = new String("a");

		System.out.println("BIENVENIDO A GASOLINERA COMBUSTIBLES & COMESTIBLES");

		while (cont != 1) {
			System.out.println();

			System.out.println(
					"¿Qué quiere hacer?\n a.Mostrar litros de surtidor\n b.Mostrar precio de surtidor\n c.Rellenar surtidor\n d.Cambiar precio de combustible\n e.Poner combustible\n s.Salir");
			menu = Entrada.cadena();

			if (menu.equals("a")) {
				System.out.println("Introduce el combustible para el que quiere saber los litros disponibles");
				tipoCombustible = Entrada.cadena().toLowerCase();

				mostrarLitros(tipoCombustible);

			} else {
				if (menu.equals("b")) {
					System.out.println("Introduce el combustible para el que quiere saber el precio");
					tipoCombustible = Entrada.cadena().toLowerCase();

					System.out.println(
							"El precio del combustible " + tipoCombustible + " es: " + devolverPrecio(tipoCombustible));

				} else {
					if (menu.equals("c")) {
						System.out.println("Introduce el combustible para el que quiere rellenar el surtidor");
						tipoCombustible = Entrada.cadena().toLowerCase();

						System.out.println("Introduce los litros a rellenar en el surtidor:");
						litrosAnadeSurtidor = Entrada.entero();

						if (rellenarSurtidor(tipoCombustible, litrosAnadeSurtidor)) {
							System.out.println("Surtidor lleno con éxito");
						} else {
							System.out.println("No se pudo rellenar el surtidor con los litros indicados");
						}

					} else {
						if (menu.equals("d")) {
							cambiarPrecio();

						} else {
							if (menu.equals("e")) {
								System.out.println("Introduce el combustible con el que quiere surtir al vehículo");
								tipoCombustible = Entrada.cadena().toLowerCase();

								System.out.println("Introduce la cantidad a surtir:");
								litrosAnadeVehiculo = Entrada.entero();

							} else {
								if (menu.equals("s")) {
									System.out.println("¡Hasta la próxima!");
									cont = 1;
								}
							}
						}
					}
				}
			}
		}
	}

	public static void mostrarLitros(String tipoCombustible) {

		if (tipoCombustible.equals("gasolina")) {
			System.out.println("El surtidor de " + tipoCombustible + " tiene " + litrosGasolina + " litros");
		} else {
			if (tipoCombustible.equals("gasolina super")) {
				System.out.println("El surtidor de " + tipoCombustible + " tiene " + litrosGasolinaSuper + " litros");
			} else {
				if (tipoCombustible.equals("gasoil")) {
					System.out.println("El surtidor de " + tipoCombustible + " tiene " + litrosGasoil + " litros");
				} else {
					if (tipoCombustible.equals("gasoil plus")) {
						System.out.println(
								"El surtidor de " + tipoCombustible + " tiene " + litrosGasoilPlus + " litros");
					} else {
						System.out.println("Ese tipo de combustible no existe");
					}
				}
			}
		}
	}

	public static double devolverPrecio(String tipoCombustible) {

		switch (tipoCombustible) {
		case "gasolina":
			return precioGasolina;
		case "gasolinasuper":
			return precioGasolinaSuper;
		case "gasoil":
			return precioGasoil;
		case "gasoilplus":
			return precioGasoilPlus;
		default:
			return -1;
		}
	}

	public static boolean rellenarSurtidor(String tipoCombustible, int litrosAnadeSurtidor) {
		boolean rellena = false;

		if (tipoCombustible.equals("gasolina")) {
			if (litrosAnadeSurtidor + litrosGasolina <= CAPACIDAD_SURTIDORES) {
				litrosGasolina = litrosGasolina + litrosAnadeSurtidor;
				rellena = true;
			} else {
				rellena = false;
			}
		} else {
			if (tipoCombustible.equals("gasolina super")) {
				if (litrosAnadeSurtidor + litrosGasolinaSuper <= CAPACIDAD_SURTIDORES) {
					litrosGasolinaSuper = litrosGasolinaSuper + litrosAnadeSurtidor;
					rellena = true;
				} else {
					rellena = false;
				}
			} else {
				if (tipoCombustible.equals("gasoil")) {
					if (litrosAnadeSurtidor + litrosGasoil <= CAPACIDAD_SURTIDORES) {
						litrosGasoil = litrosGasoil + litrosAnadeSurtidor;
						rellena = true;
					} else {
						rellena = false;
					}
				} else {
					if (tipoCombustible.equals("gasoil plus")) {
						if (litrosAnadeSurtidor + litrosGasoilPlus <= CAPACIDAD_SURTIDORES) {
							litrosGasoilPlus = litrosGasoilPlus + litrosAnadeSurtidor;
							rellena = true;
						} else {
							rellena = false;
						}
					} else {
						rellena = false;

					}
				}
			}
		}
		return rellena;
	}

	public static void cambiarPrecio() {
		double nuevoPrecio = 0;

		System.out.println("Indica el combustible al que quiere cambiar el precio:");
		tipoCombustible = Entrada.cadena().toLowerCase();

		System.out.println("Indica el nuevo precio del combustible:");
		nuevoPrecio = Entrada.real();

		if (tipoCombustible.equals("gasolina")) {
			precioGasolina = nuevoPrecio;
			System.out.println(
					"Precio de " + tipoCombustible + " cambiado con éxito, el nuevo precio es de " + precioGasolina);
		} else {
			if (tipoCombustible.equals("gasolina super")) {
				precioGasolinaSuper = nuevoPrecio;
				System.out.println("Precio de " + tipoCombustible + " cambiado con éxito, el nuevo precio es de "
						+ precioGasolinaSuper);
			} else {
				if (tipoCombustible.equals("gasoil")) {
					precioGasoil = nuevoPrecio;
					System.out.println("Precio de " + tipoCombustible + " cambiado con éxito, el nuevo precio es de "
							+ precioGasoil);
				} else {
					if (tipoCombustible.equals("gasoil plus")) {
						precioGasoilPlus = nuevoPrecio;
						System.out.println("Precio de " + tipoCombustible
								+ " cambiado con éxito, el nuevo precio es de " + precioGasoilPlus);
					} else {
						System.out.println("Ese tipo de combustible no existe");
					}
				}
			}
		}
	}

	public static boolean vaciarSurtidor(String tipoCombustible, int litrosAnadeVehiculo) {
		boolean seVacia = false;

		if (tipoCombustible.equals("gasolina")) {
			if (litrosGasolina >= litrosAnadeVehiculo) {
				litrosGasolina = litrosGasolina - litrosAnadeVehiculo;
				seVacia = true;
			} else {
				seVacia = false;
			}
		} else {
			if (tipoCombustible.equals("gasolina super")) {
				if (litrosGasolina >= litrosAnadeVehiculo) {
					litrosGasolina = litrosGasolina - litrosAnadeVehiculo;
					seVacia = true;
				} else {
					seVacia = false;
				}
			} else {
				if (tipoCombustible.equals("gasoil")) {
					if (litrosGasolina >= litrosAnadeVehiculo) {
						litrosGasolina = litrosGasolina - litrosAnadeVehiculo;
						seVacia = true;
					} else {
						seVacia = false;
					}
				} else {
					if (tipoCombustible.equals("gasoil plus")) {
						if (litrosGasolina >= litrosAnadeVehiculo) {
							litrosGasolina = litrosGasolina - litrosAnadeVehiculo;
							seVacia = true;
						} else {
							seVacia = false;
						}
					} else {
						seVacia = false;
					}
				}
			}
		}
		return seVacia;
	}

	public static void ponerCombustible(String tipoCombustible, int dinero) {
		int contDinero = 1;
		double contLitros = 1.1, precio = 1.1;

		precio = devolverPrecio(tipoCombustible);

		System.out.println("Coche repostando " + dinero + " euros de " + tipoCombustible + "...");
		System.out.println("Euros          litros");
		while ((contDinero > dinero) && (vaciarSurtidor(tipoCombustible, litrosAnadeVehiculo))) {

			contLitros = (1/devolverPrecio(tipoCombustible));
			
			System.out.println(contDinero + "           " + contLitros);

			litrosAnadeVehiculo= litrosAnadeVehiculo+(int)contLitros;
			contDinero++;
		
		}
		System.out.println("Se han dispensado " +contLitros+" de " + tipoCombustible);
	}
}
