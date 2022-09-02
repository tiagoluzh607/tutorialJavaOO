
public class Inicia {
	public static void main(String[] args) {
		
	    Carro gol = new Carro("GOL 2010 1.0",10.8d);
	    gol.setKmPorLitro(10.5);
	    Carro celta = new Carro("Celta 2010 1.0",13.8d);
	    
	    //conta
	    Double custoViagemGol = new Viagem(250d, gol).custoDaViagem();
		System.out.println(gol.getNome()+": "+custoViagemGol);
		
		Double custoViagemCelta = new Viagem(250d, celta).custoDaViagem();
		System.out.println(celta.getNome()+": "+custoViagemCelta);
	}
}
