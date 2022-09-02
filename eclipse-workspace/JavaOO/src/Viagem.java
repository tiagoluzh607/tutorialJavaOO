
public class Viagem {
	private final Double precoGasolina = 4.90d;

	private Double km;
	private Carro carro;

	public Viagem(Double km, Carro carro) {
		super();
		this.km = km;
		this.carro = carro;
	}

	public Double getKm() {
		return km;
	}

	public Carro getCarro() {
		return carro;
	}

	public Double custoDaViagem() {
		Double precoViagem = (this.km / this.carro.getKmPorLitro()) * this.precoGasolina;
		return precoViagem;
	}
}
