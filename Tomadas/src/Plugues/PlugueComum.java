package Plugues;
import Interfaces.PlugueDoisPinos;
import Interfaces.TomadaDoisPinos;

public class PlugueComum implements PlugueDoisPinos{

	public void conectar(TomadaDoisPinos tdp) {
//		System.out.println("Conactado plugue comum");
		tdp.fornecerEnergia();
	}

}