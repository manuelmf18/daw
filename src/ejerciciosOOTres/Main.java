package ejerciciosOOTres;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula au=new Aula("3 ESO A",10);
		
		System.out.println("---AÑADIENDO ALUMNOS Y ASIGNATURAS---\n");
		
		//alumno 0		
		if(au.anyadirAlumno(new Alumno("Manolito","Gafotas",5)))
		{
			System.out.println("Alumno añadido con éxito");
			
			if(au.getAlumno(0).matricularAsignatura(new Asignatura("Historia",5.34)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");
			
			if(au.getAlumno(0).matricularAsignatura(new Asignatura("Inglés",6.75)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");
			
			if(au.getAlumno(0).matricularAsignatura(new Asignatura("Matemáticas",8.54)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");			
		}
		else
			System.out.println("No se pudo añadir al alumno");
		
		//alumno 1
		if(au.anyadirAlumno(new Alumno("Josefa","Botella",6)))
		{
			System.out.println("Alumno añadido con éxito");
			
			if(au.getAlumno(1).matricularAsignatura(new Asignatura("Inglés",9.14)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");
			
			if(au.getAlumno(1).matricularAsignatura(new Asignatura("Lengua",4.75)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");
			
			if(au.getAlumno(1).matricularAsignatura(new Asignatura("Informática",7.4)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");			
		}
		else
			System.out.println("No sepudo añadir al alumno");
		
		//alumno 2
		if(au.anyadirAlumno(new Alumno("María de la O","Gutiérrez",3)))
		{
			System.out.println("Alumno añadido con éxito");
			
			if(au.getAlumno(2).matricularAsignatura(new Asignatura("Educación Física",4.51)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");
			
			if(au.getAlumno(2).matricularAsignatura(new Asignatura("Matemáticas",8.75)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");
			
			if(au.getAlumno(2).matricularAsignatura(new Asignatura("Informática",4.52)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");			
		}
		else
			System.out.println("No sepudo añadir al alumno");
		
		//alumno 3
		if(au.anyadirAlumno(new Alumno("Dámaso","Alonso",4)))
		{
			System.out.println("Alumno añadido con éxito");
			
			if(au.getAlumno(3).matricularAsignatura(new Asignatura("Lengua",5.64)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");
			
			if(au.getAlumno(3).matricularAsignatura(new Asignatura("Matemáticas",3.42)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");
			
			if(au.getAlumno(3).matricularAsignatura(new Asignatura("Historia",6.74)))
				System.out.println("Asignatura añadida");
			else
				System.out.println("No se pudo añadir la asignatura");			
		}
		else
			System.out.println("No sepudo añadir al alumno");
	
		
		System.out.println("\n-----MOSTRANDO ALUMNOS----\n");
		au.muestraAula();
		
		
		System.out.println("\n-----CAMBIANDO LA NOTA DE MANOLITO GAFOTAS----");
		if(au.getAlumno(0).cambiarNotaAsignatura("Historia", 6.70)) {
			System.out.println("Se cambió la nota del alumno  con éxito");
			System.out.println("Nombre: "+au.getAlumno(0).getNombreAlumno());
			System.out.println("Apellidos: "+au.getAlumno(0).getApellidosAlumno());
			au.getAlumno(0).muestraTodasLasAsignaturas();
		}
		else
			System.out.println("No se pudo cambiar la nota del alumno");
		
		System.out.println("\n-----ORDENANDO NOTAS DE JOSEFA BOTELLA POR NOMBRE-----");
		au.getAlumno(1).ordenaAsignaturasPorNombre();
		System.out.println("Nombre: "+au.getAlumno(1).getNombreAlumno());
		System.out.println("Apellidos: "+au.getAlumno(1).getApellidosAlumno());
		au.getAlumno(1).muestraTodasLasAsignaturas();
		
		System.out.println("\n-----ORDENANDO NOTAS DE MARIA DE LA O POR NOTAS-----");
		au.getAlumno(2).ordenaAsignaturasPorNota();
		System.out.println("Nombre: "+au.getAlumno(2).getNombreAlumno());
		System.out.println("Apellidos: "+au.getAlumno(2).getApellidosAlumno());
		au.getAlumno(2).muestraTodasLasAsignaturas();
		
		System.out.println("\n----MOSTRANDO NOTA MEDIA DE DÁMASO ALONSO----");
		System.out.println("Nota media: "+(Math.rint(au.getAlumno(3).calculaMediaAlumno()*100)/100));
	}

}
