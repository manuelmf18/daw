package ejerciciosInicialesOO;

public class Numero {
	private int valor;
	
	//constructor vacío
	public Numero() {
			this.valor = 0;
		}
		
	//constructor con parámetros
	public Numero(int valor) {
			this.valor=valor;
		}
		
	//constructor copia
	public Numero(Numero numeroCopia) {
			this.valor = numeroCopia.valor;		
		}
		
	//getters
		public int getValor() {
			return valor;
		}
		
	//setters
		public void setValor(int valor) {
			this.valor = valor;
		}
		
		public void anyade(int numero) {
			valor = valor + numero;
		}
		
		public void resta(int numero) {
			valor = valor - numero;
		}	
		
		public int getDoble() {
			return valor*2;
		}
		
		public int getTriple() {
			return valor*3;
		}
}