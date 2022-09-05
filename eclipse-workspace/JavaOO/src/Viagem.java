
public class Viagem {
	private final Double precoGasolina = 4.90d;

	private Double km;
	private Veiculo veiculo;

	public Viagem(Double km, Veiculo veiculo) {
		super();
		this.km = km;
		this.veiculo = veiculo;
	}

	public Double getKm() {
		return km;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public Double custoDaViagem() {
		Double precoViagem = (this.km / this.veiculo.getKmPorLitro()) * this.precoGasolina;
		return precoViagem;
	}
	
	public Double custoDaViagem(Double valorDesconto) {
		return this.custoDaViagem() - valorDesconto;
	}
}
