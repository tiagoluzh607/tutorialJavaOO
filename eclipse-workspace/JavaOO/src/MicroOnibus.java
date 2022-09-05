
public class MicroOnibus extends Veiculo {

	public MicroOnibus(String nome, Double kmPorLitro) {
		super(nome,kmPorLitro);
	}

	@Override
	public Double getKmPorLitro() {
		return kmPorLitro;
	}
	
	
	
}
