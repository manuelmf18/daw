package ejerciciosInicialesOO;

public class VisibilidadTestPaquete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Visibilidades numA=new Visibilidades();
		Visibilidades numB=new Visibilidades();
		Visibilidades numC=new Visibilidades();
		
		numA.setEnteroA(6);
		System.out.println("El numA tiene un valor de: "+numA.getEnteroA());
		
		numB.setEnteroB(7);
		System.out.println("El numB tiene un valor de: "+numB.getEnteroB());
		
		//numC.setEnteroC(9);
		//System.out.println("El numC tiene un valor de: "+numC.getEnteroC());
	}

}