package ejerciciosOOTres;

public class Asignatura {
	private String nombreAsignatura;
	private double nota;
	
	public Asignatura(String nA, double n)
	{
		this.nombreAsignatura=nA;
		this.nota=n;
	}
	
	public Asignatura(Asignatura as)
	{
		this.nombreAsignatura=as.nombreAsignatura;
		this.nota=as.nota;
	}
	
	public String getNombreAsignatura()
	{
		return nombreAsignatura;
	}
	
	public double getNota()
	{
		return nota;
	}
	
	public void setNombreAsignatura(String nA)
	{
		nombreAsignatura=nA;
	}
	
	public void setNota(double not)
	{
		nota=not;
	}
	
	public String toString()
	{
		return new String("\n\tNombre asignatura: "+nombreAsignatura
							+"\n\tNota: "+Math.rint(nota*100)/100);
				
	}
	
	
}