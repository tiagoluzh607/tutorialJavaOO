
public class Inicia {
	public static void main(String[] args) {
		
	    Carro gol = new Carro("GOL 2010 1.0",10.8d);
	    Carro celta = new Carro("Celta 2010 1.0",13.8d);
	    
	    //conta
	    Double precoGasolina = 4.90d;
	    Double kmViagem = 250d;
	    
	    Double custoViagemGol = (kmViagem / gol.kmPorLitro) * precoGasolina;
		System.out.println(gol.nome+": "+custoViagemGol);
		
		Double custoViagemCelta = (kmViagem / celta.kmPorLitro) * precoGasolina;
		System.out.println(celta.nome+": "+custoViagemCelta);
	}
}
