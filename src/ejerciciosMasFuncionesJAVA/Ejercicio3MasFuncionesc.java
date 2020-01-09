package ejerciciosMasFuncionesJAVA;

public class Ejercicio3MasFuncionesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
			System.out.println("Valor: "+generaDigitoAleatorioHex());
		}
	
	public static int generaDigitoAleatorioBin()
	{
		return (int)(Math.round(Math.random()));
	}

	public static int generaDigitoAleatorioOct()
	{
		return (int)(Math.round(Math.random()*7));
	}
	
	public static int generaDigitoAleatorioDec()
	{
		return (int)(Math.round(Math.random()*9));
	}
	
	public static char generaDigitoAleatorioHex()
	{
		int valorAleatorio=(int) (Math.random()*16);
		
		switch (valorAleatorio) {
		case 0:
			return '0';
		case 1:
			return '1';
		case 2:
			return '2';
		case 3:
			return '3';
		case 4:
			return '4';
		case 5:
			return '5';
		case 6:
			return '6';
		case 7:
			return '7';
		case 8:
			return '8';
		case 9:
			return '9';
		case 10:
			return 'A';
		case 11:
			return 'B';
		case 12:
			return 'C';
		case 13:
			return 'D';
		case 14:
			return 'E';
		case 15:
			return 'F';
		default:
			return ' ';
		}
	}

}