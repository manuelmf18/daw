package funcionesyprocedimientos;

public class EjerciciosIniciales1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int modulo = 0;

		System.out.println("Introduce un n�mero");
		modulo(Entrada.entero());
		/*el par�ntesis te ahorra estos dos pasos:
		 *  modulo(modulo);
		modulo=Entrada.entero(); */
	}

	public static void modulo(int num) {
		while (num > 0) {
			System.out.println("M�dulo ejecut�ndose");
			num--;
		}
	}

}
