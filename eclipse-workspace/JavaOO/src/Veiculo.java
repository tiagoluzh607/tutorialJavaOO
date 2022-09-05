
public abstract class Veiculo {

	public String nome;
	public Double kmPorLitro;

	public Veiculo(String nome, Double kmPorLitro) {
		this.nome = nome;
		this.kmPorLitro = kmPorLitro;
	}

	public String getNome() {
		return nome;
	}

	public abstract Double getKmPorLitro();

	public void setKmPorLitro(Double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}
}
