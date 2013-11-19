import Adaptadores.AdaptadorCE;
import Adaptadores.AdaptadorEC;
import Plugues.PlugueComum;
import Plugues.PlugueEuropeu;


public class Cliente {
	
	public static void main(String[] args) {
		
		PlugueEuropeu pe = new PlugueEuropeu();
		PlugueComum pc = new PlugueComum();
		
		AdaptadorEC EuopeuComun = new AdaptadorEC();
		AdaptadorCE ComumEuropeu = new AdaptadorCE();
		
		pe.conectar(ComumEuropeu);
		pc.conectar(EuopeuComun);
	}
}