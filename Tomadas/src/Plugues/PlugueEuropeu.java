package Plugues;
import Interfaces.PlugueTresPinos;
import Interfaces.TomadaTresPinos;

public class PlugueEuropeu implements PlugueTresPinos{

	public void conectar(TomadaTresPinos ttp) {
//		System.out.println("Conectado plugue europeu.");
		ttp.fornecerEnergia();
	}
	
}