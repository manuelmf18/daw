package ejerciciosOOTres;

public class Aula {
	private String nombreAula;
	private Alumno [] alumnos;
	private int numAlumnos;
	
	public Aula(String nom,int tam)
	{
		nombreAula=nom;
		alumnos=new Alumno[tam];
		numAlumnos=0;
	}
	
	public String getNombreAula()
	{
		return nombreAula;
	}
	
	public Alumno getAlumno(int pos)
	{
		if(pos>=0 && pos<numAlumnos)
			return alumnos[pos];
		else
			return null;
	}
	
	public boolean anyadirAlumno(Alumno al)
	{
		if(numAlumnos<alumnos.length)
		{
			alumnos[numAlumnos]=al;
			numAlumnos++;
			return true;
		}
		else
			return false;
	}
	
	public void muestraAula()
	{
		System.out.println("Aula: "+this.nombreAula);
		
		for(int i=0;i<numAlumnos;i++)
		{
			System.out.println("\n___________________");
			System.out.println("Nombre: "+alumnos[i].getNombreAlumno());
			System.out.println("Apellidos: "+alumnos[i].getApellidosAlumno());
			alumnos[i].muestraTodasLasAsignaturas();
			System.out.println("\n\tNOTA MEDIA: "+alumnos[i].calculaMediaAlumno());
		}			
	}
}

