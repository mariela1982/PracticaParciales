package ar.edu.unlam.pb2;

public class TarjetaDeDebito implements Pagadora {
	
	private Long numero;
	private String titular;
	private String fechaDeVencimiento;
	private Integer codigoDeSeguridad;
	private Double saldo;
	final Integer CANTIDAD_DIGITOS_DE_LA_TARJETA = 16;

	

	public TarjetaDeDebito(Long numero, String titular, String fechaDeVencimiento,
			Integer codigoDeSeguridad) throws NumeroDeTarjetaInvalidoException {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setCodigoDeSeguridad(codigoDeSeguridad);
		this.setSaldo(0.0);
	}

	private void setCodigoDeSeguridad(Integer codigoDeSeguridad2) {
		this.codigoDeSeguridad = codigoDeSeguridad2;
		
	}
 
	private void setFechaDeVencimiento(String fechaDeVencimiento2) {
		this.fechaDeVencimiento = fechaDeVencimiento2;
		
	}

	private void setTitular(String titular2) {
		this.titular = titular2;
		
	}

	private void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException{
		
		if(numero.toString().length()!= CANTIDAD_DIGITOS_DE_LA_TARJETA) {
			throw new NumeroDeTarjetaInvalidoException();
		}
		
			this.numero = numero;
		
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		
		return null;
	}



	@Override
	public void setSaldo(Double d) {
		this.saldo = d;
		
	}

	@Override
	public Long getNumero() {
		
		return this.numero;
	}

	@Override
	public String getTitular() {
		
		return this.titular;
	}

	@Override
	public Integer getCodigoDeSeguridad() {
		
		return this.codigoDeSeguridad;
	}

	@Override
	public String getFechaDeVencimiento() {
		
		return this.fechaDeVencimiento;
	}

	@Override
	public Double getSaldo() {
		
		return this.saldo;
	}







}
