
public class Carro extends Veiculo {

	public Carro(String nome, Double kmPorLitro) {
		super(nome,kmPorLitro);
	}

	@Override
	public Double getKmPorLitro() {
		return kmPorLitro * 2;
	}
}
