
public class Inicia {
	public static void main(String[] args) {
		
		String nomeCarroGol = "GOL 2010 1.0";
		Double kmPorLitroGol = 10.8d;
		
		String nomeCarroCelta = "Celta 2010 1.0";
	    Double kmPorLitroCelta = 13.8d;
	    
	    //conta
	    Double precoGasolina = 4.90d;
	    Double kmViagem = 250d;
	    
	    Double custoViagemGol = (kmViagem / kmPorLitroGol) * precoGasolina;
		System.out.println(nomeCarroGol+": "+custoViagemGol);
		
		Double custoViagemCelta = (kmViagem / kmPorLitroCelta) * precoGasolina;
		System.out.println(nomeCarroCelta+": "+custoViagemCelta);
	}
}
