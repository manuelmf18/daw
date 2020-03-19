package ejerciciosOOTres;

public class Alumno {
	private String nombreAlumno;
	private String apellidosAlumno;
	private Asignatura[] asignaturas;
	private int numAsignaturasMatriculadas;
	
	public Alumno(String nA, String aA, int tam)
	{
		nombreAlumno=nA;
		apellidosAlumno=aA;
		asignaturas=new Asignatura[tam];
		numAsignaturasMatriculadas=0;
	}
	
	public String getNombreAlumno()
	{
		return nombreAlumno;
	}
	
	public String getApellidosAlumno()
	{
		return apellidosAlumno;
	}
	
	public Asignatura getAsignatura(int pos)
	{
		if(pos>=0 && pos<numAsignaturasMatriculadas)
			return asignaturas[pos];
		else
			return null;
	}
	
	public boolean matricularAsignatura(Asignatura as)
	{
		if(numAsignaturasMatriculadas<asignaturas.length)
		{
			asignaturas[numAsignaturasMatriculadas]=as;
			numAsignaturasMatriculadas++;
			return true;
		}
		else
			return false;
	}
	
	public boolean cambiarNotaAsignatura(String nomAsig,double nota)
	{
		for(int i=0;i<numAsignaturasMatriculadas;i++)
			if(asignaturas[i].getNombreAsignatura().equals(nomAsig)) {
				asignaturas[i].setNota(nota);
				return true;
			}
		return false;		
	}
	
	
	
	public void muestraTodasLasAsignaturas()
	{
		for(int i=0;i<numAsignaturasMatriculadas;i++)
		{
			System.out.println("\n----------"+asignaturas[i].toString());
		}
	}
	
	public double calculaMediaAlumno()
	{
		double media=0;
		
		for(int i=0;i<numAsignaturasMatriculadas;i++)
			media+=asignaturas[i].getNota();
		
		return (Math.rint(media/numAsignaturasMatriculadas*100)/100);
	}
	
	//ordenar asignaturas	
	
	public void ordenaAsignaturasPorNombre()
	{
		int  pos;
		for (int i = 0; i <= (numAsignaturasMatriculadas - 2); i++) {
			pos = i;
			for (int j = i + 1; j <= (numAsignaturasMatriculadas - 1); j++){
				if (asignaturas[j].getNombreAsignatura().compareTo(asignaturas[pos].getNombreAsignatura())<0)
					pos = j;
			}
			
			if (pos != i) {
				Asignatura temp=new Asignatura(asignaturas[pos]);
				asignaturas[pos]=asignaturas[i];
				asignaturas[i]=temp;
			}
		}
	}
	
	public void ordenaAsignaturasPorNota()
	{
		int i,j;
		Asignatura temp;
		for (i = 1; i < numAsignaturasMatriculadas; i++) {
			temp = asignaturas[i];
			j = i - 1;
			while ((j >= 0) && (asignaturas[j].getNota()<temp.getNota())) {
				asignaturas[j + 1] = asignaturas[j];
				j--;
			}
			asignaturas[j + 1] = temp;
		}
	}

	
}
