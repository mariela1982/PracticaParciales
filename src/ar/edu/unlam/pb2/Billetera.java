package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Billetera {
	
	private String nombreBilletera;
	private Set<Comercio> comercioAdherido;
	private Set<Consumidor> cliente;

	public Billetera(String nombre) {
		this.nombreBilletera = nombre;
		this.comercioAdherido = new HashSet<Comercio>();
		this.cliente = new HashSet<Consumidor>();
	}

	public String getNombreBilletera() {
		return nombreBilletera;
	}

	public void setNombreBilletera(String nombreBilletera) {
		this.nombreBilletera = nombreBilletera;
	}

	public Set<Comercio> getComercioAdherido() {
		return comercioAdherido;
	}

	
	public Set<Consumidor> getCliente() {
		return cliente;
	}

	public void setCliente(Set<Consumidor> cliente) {
		this.cliente = cliente;
	}

	public void agregarComercio(Comercio nuevo) {
		comercioAdherido.add(nuevo);
		
	}

	public Integer getCantidadDeComercios() {
		
		return this.comercioAdherido.size();
	}
	

}
