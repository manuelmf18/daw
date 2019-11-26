package funcionesyprocedimientos;

public class EjerciciosIniciales1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int modulo = 0;

		System.out.println("Introduce un número");
		modulo(Entrada.entero());
		/*el paréntesis te ahorra estos dos pasos:
		 *  modulo(modulo);
		modulo=Entrada.entero(); */
	}

	public static void modulo(int num) {
		while (num > 0) {
			System.out.println("Módulo ejecutándose");
			num--;
		}
	}

}
