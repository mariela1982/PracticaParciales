package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Billetera {
	
	private String nombreBilletera;
	private Set<Comercio> comercioAdherido;
	private Set<Consumidor> cliente;
	private Map<MedioDePago,Integer> medioDePago;

	public Billetera(String nombre) {
		this.nombreBilletera = nombre;
		this.comercioAdherido = new HashSet<Comercio>();
		this.cliente = new HashSet<Consumidor>();
		this.medioDePago = new HashMap<>();
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

	public void agregarConsumidor(Consumidor nuevo) {
		cliente.add(nuevo);
		
	}

	public Integer getCantidadDeConsumidores() {
		
		return this.cliente.size();
	}

	public void agregarMedioDePago(Integer dniDelConsumidor, TarjetaDeDebito tarjetaDeDebito) throws NoCoincideTitularException {
		Consumidor consumidor = buscarConsumidor(dniDelConsumidor);
	if (consumidor == null ) {
		throw new NoCoincideTitularException();
	} else {
		
	}
		
	}

	private Consumidor buscarConsumidor(Integer dniDelConsumidor) {
	for(Consumidor actual : cliente) {
		if(actual.getDni().equals(dniDelConsumidor)) {
			return actual;
		}
	}
		return null;
	}
	

}
