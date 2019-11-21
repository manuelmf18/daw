package ejerciciosJAVAI;

public class Ejercicio6Juanma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long cociente = 0, resto = 0;

		int cifra0 = 0, cifra1 = 0, cifra2 = 0, cifra3 = 0, cifra4 = 0, cifra5 = 0, cifra6 = 0, cifra7 = 0, cifra8 = 0,
				cifra9 = 0;

		System.out.println("Introduce un número");
		cociente = Entrada.entero();

		while (cociente != 0) {
			resto = cociente % 10;
			cociente = cociente / 10;

			if (resto == 0) {
				cifra0++;
			} else {
				if (resto == 1) {
					cifra1++;
				} else {
					if (resto == 2) {
						cifra2++;
					} else {
						if (resto == 3) {
							cifra3++;
						} else {
							if (resto == 4) {
								cifra4++;
							} else {
								if (resto == 5) {
									cifra5++;
								} else {
									if (resto == 6) {
										cifra6++;
									} else {
										if (resto == 7) {
											cifra7++;
										} else {
											if (resto == 8) {
												cifra8++;
											} else {
												if (resto == 9) {
													cifra9++;
												}

											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
System.out.println("Cifra 0 : hay "+cifra0+" en su número");
System.out.println("Cifra 1 : hay "+cifra1+" en su número");
System.out.println("Cifra 2 : hay "+cifra2+" en su número");
System.out.println("Cifra 3 : hay "+cifra3+" en su número");
System.out.println("Cifra 4 : hay "+cifra4+" en su número");
System.out.println("Cifra 5 : hay "+cifra5+" en su número");
System.out.println("Cifra 6 : hay "+cifra6+" en su número");
System.out.println("Cifra 7 : hay "+cifra7+" en su número");
System.out.println("Cifra 8 : hay "+cifra8+" en su número");
System.out.println("Cifra 9 : hay "+cifra9+" en su número");
	}

}
