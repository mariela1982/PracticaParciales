package ar.edu.unlam.pb2;

public class TarjetaDeCredito extends Tarjeta implements Pagadora {
	private Double limiteEnPesos;
	private Double limiteEnDolares;
	

	public TarjetaDeCredito(Long numero, String titular, String fechaDeVencimiento, Integer codigoDeSeguridad, Double limiteEnPesos, Double limiteEnDolares)
			throws NumeroDeTarjetaInvalidoException {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setCodigoDeSeguridad(codigoDeSeguridad);
		this.setSaldo(0.0);
		this.setLimiteEnDolares(limiteEnDolares);
		this.setLimiteEnPesos(limiteEnPesos);
	}
	
	public Double getLimiteEnPesos() {
		return limiteEnPesos;
	}

	public void setLimiteEnPesos(Double limiteEnPesos) {
		this.limiteEnPesos = limiteEnPesos;
	}
	

	public Double getLimiteEnDolares() {
		return limiteEnDolares;
	}

	public void setLimiteEnDolares(Double limiteEnDolares) {
		this.limiteEnDolares = limiteEnDolares;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Double getSaldo() {
		
		return saldo;
	}

	
	


}
