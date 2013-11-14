
public class App {
	
	public static void main(String[] args) {
//		CalculadoraAtual c = new CalculadoraAtual();
		CalculadoraAtual c = new AdapterCalc(new JavaCalculator());
		
		System.out.println(c.soma(12, 21));
		System.out.println(c.subtração(12, 21));
		System.out.println(c.multiplicação(10, 21));
		System.out.println(c.divisão(12, 2));
	}

}
