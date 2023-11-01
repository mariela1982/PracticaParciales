package ar.edu.unlam.pb2;

public class Consumidor {
	
	private Integer dni;
	private String nombre;

	public Consumidor(Integer dni, String nombre) {
		this.setDni(dni);
		this.setNombre(nombre);
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
