package ar.edu.unlam.pb2;

public abstract class Tarjeta {
	protected Long numero;
	protected String titular;
	protected String fechaDeVencimiento;
	protected Integer codigoDeSeguridad;
	protected Double saldo;
	final Integer CANTIDAD_DIGITOS_DE_LA_TARJETA = 16;
	
	
	protected  void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException{
		if(numero.toString().length()!= CANTIDAD_DIGITOS_DE_LA_TARJETA) {
			throw new NumeroDeTarjetaInvalidoException();
		}
		
			this.numero = numero;
	}
	
	
	public void setCodigoDeSeguridad(Integer codigoDeSeguridad2) {
		this.codigoDeSeguridad = codigoDeSeguridad2;
		
	}
 
	public void setFechaDeVencimiento(String fechaDeVencimiento2) {
		this.fechaDeVencimiento = fechaDeVencimiento2;
		
	}

	public void setTitular(String titular2) {
		this.titular = titular2;
		
	}
	
	public void setSaldo(Double d) {
		this.saldo = d;
		
	}

	
	public Long getNumero() {
				return this.numero;
	}


	public String getTitular() {
				return this.titular;
	}

	
	public Integer getCodigoDeSeguridad() {
				return this.codigoDeSeguridad;
	}

	
	public String getFechaDeVencimiento() {
				return this.fechaDeVencimiento;
	}

	
	public abstract Double getSaldo();

	
		
		

	


	

	
}
