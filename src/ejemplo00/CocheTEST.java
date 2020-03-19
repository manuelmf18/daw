package ejemplo00;

public class CocheTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1=new Coche();
		Coche c2=new Coche("1312FFA","MERCEDES","BLANCO",540,20,2);
		
		Coche[] vector=new Coche[5];
		
		for(int i=0;i<vector.length;i++)
			vector[i]=new Coche();
		
		for(int i=0;i<vector.length;i++)
			System.out.println("Las matriculas son: "+
						vector[i].getMatricula());
		
		
//		System.out.println("El color del coche 1 es: "+c1.getColor());
//		
//		c1.setColor("caca");
//		c2.setMatricula("2312fas");
//		
//		System.out.println("Ahora el color del coche 1 es: "+c1.getColor());
		
//		System.out.println("El número de coches es: "+Coche.getNumero_coches());
//		Coche.setNumero_coches(5);
//
//		System.out.println("Ahora el número de coches es: "+c1.getNumero_coches());
		
		System.out.println("El coche tiene  "+c2.getKilometraje()+" kilometraje"
				+" y "+c2.getCantidadGasolina()+" de gasofa");
		
		if(c2.hacerViaje(40))
			System.out.println("El viaje se ha realizado: "
					+"y el coche tiene ahora "+c2.getKilometraje()+" kilometraje"
					+" y "+c2.getCantidadGasolina()+" de gasofa");
		else
			System.out.println("El viaje NO se ha realizado: "
					+"y el coche tiene ahora "+c2.getKilometraje()+" kilometraje"
					+" y "+c2.getCantidadGasolina()+" de gasofa");
		
	}

}