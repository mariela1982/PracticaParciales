package ar.edu.unlam.pb2;

import java.util.Objects;

public class Comercio {
	
	private Long cuit;
	private String nombre;
	private final Integer CANTIDAD_DIGITOS = 11;

	public Comercio(Long cuit, String nombre) throws CuitInvalidoException {
		this.setCuit(cuit);
		this.setNombre(nombre);
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) throws CuitInvalidoException {
		if (cuit.toString().length() != CANTIDAD_DIGITOS || cuit.toString().substring(0, 2)== "30" ) {
			throw new CuitInvalidoException();
			
		}
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		return Objects.equals(cuit, other.cuit);
	}
	
	

}
