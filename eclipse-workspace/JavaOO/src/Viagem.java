
public class Viagem {
	private final Double precoGasolina = 4.90d;

	private Double km;
	private IViagemCalculavel viagemCalculavel;

	public Viagem(Double km, IViagemCalculavel viagemCalculavel) {
		super();
		this.km = km;
		this.viagemCalculavel = viagemCalculavel;
	}

	public Double getKm() {
		return km;
	}

	public IViagemCalculavel getViagemCalculavel() {
		return viagemCalculavel;
	}
	
	public Double custoDaViagem() {
		Double precoViagem = (this.km / this.viagemCalculavel.getKmPorLitro()) * this.precoGasolina;
		return precoViagem;
	}
	
	public Double custoDaViagem(Double valorDesconto) {
		return this.custoDaViagem() - valorDesconto;
	}
}
