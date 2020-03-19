package ejerciciosInicialesOO;

public class Visibilidades {
	private int a;
	private int b;
	private int c;
	
	
	//constructor vacío
	public Visibilidades() {
		this.a=0;
		this.b=0;
		this.c=0;
		
	}
	
	//constructor con parametros
	public Visibilidades (int aa, int bb, int cc) {
		this.a=aa;
		this.b=bb;
		this.c=cc;
		
	}
	
	
	//getters
	public int getEnteroA() {
		return a;
	}
	
	public int getEnteroB() {
		return b;
	}
	
	private int getEnteroC() {
		return c;
	}
	
	
	//setters
	void setEnteroA(int nuevoA) {
		this.a=nuevoA;
	}
	
	void setEnteroB(int nuevoB) {
		this.b=nuevoB;
	}
	private void setEnteroC(int nuevoC) {
		this.c=nuevoC;
	}
	
	

}