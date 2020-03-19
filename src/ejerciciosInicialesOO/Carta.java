package ejerciciosInicialesOO;

public class Carta {

	private int numero;
	private String palo;
	
	//constructores
	public Carta()
	{
		this.numero = 0;
		this.palo = new String("");
	}
	public Carta(int num, String palo)
	{
		this.numero = num;
		this.palo = palo;
	}
	//getters
	public int getNumero()
	{
		return numero;
	}
	public String getPalo()
	{
		return palo;
	}
	//setters
	public void setNumero(int num) {
		this.numero = num;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
}