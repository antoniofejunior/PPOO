package Tomadas;
import Interfaces.TomadaDoisPinos;

public class TomadaComum implements TomadaDoisPinos {

	public void fornecerEnergia() {
		System.out.println("Tomada comum.");
	}

}