
public class Inicia {
	public static void main(String[] args) {
		
	    Carro gol = new Carro("GOL 2010 1.0",10.8d);
	    gol.setKmPorLitro(10.5);
	    Carro celta = new Carro("Celta 2010 1.0",13.8d);
	    
	    //Onibus
	    MicroOnibus mercedes = new MicroOnibus("Jinbei Topic 2010", 5.7d);
	    
	    //aviao
	    Aviao aviao = new Aviao();
	    
	    //conta
	    Double custoViagemGol = new Viagem(250d, gol).custoDaViagem(10d);
		System.out.println(gol.getNome()+": "+custoViagemGol);
		
		Double custoViagemCelta = new Viagem(250d, celta).custoDaViagem();
		System.out.println(celta.getNome()+": "+custoViagemCelta);
		
		Double custoViagemMicroOnibus = new Viagem(250d, mercedes).custoDaViagem();
		System.out.println(mercedes.getNome()+": "+custoViagemMicroOnibus);
		
		Double custoViagemAviao = new Viagem(250d, aviao).custoDaViagem();
		System.out.println("aviao: "+custoViagemAviao);
	}
}
