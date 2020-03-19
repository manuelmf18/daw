package practica6_JAVA;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;

	// constructor vacio
//	public Persona() { // public
//
//		this.dni = dni;
//		this.nombre = nombre;
//		this.apellidos = apellidos;
//	}

	// constructor con parámetros
	public Persona(String dni, String nombre, String apellidos) { //public
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	// getters
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	// setters
	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
