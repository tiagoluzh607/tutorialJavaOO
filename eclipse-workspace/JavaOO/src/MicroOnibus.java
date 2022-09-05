
public class MicroOnibus {
	public String nome;
	public Double kmPorLitro;

	public MicroOnibus(String nome, Double kmPorLitro) {
		this.nome = nome;
		this.kmPorLitro = kmPorLitro;
	}

	public String getNome() {
		return nome;
	}

	public Double getKmPorLitro() {
		return kmPorLitro * 2;
	}

	public void setKmPorLitro(Double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}
}
