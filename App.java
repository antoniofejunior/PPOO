
public class App {
	
	public static void main(String[] args) {
//		CalculadoraAtual c = new CalculadoraAtual();
		CalculadoraAtual c = new AdapterCalc(new JavaCalculator());
		
		System.out.println(c.soma(12, 21));
		System.out.println(c.subtra��o(12, 21));
		System.out.println(c.multiplica��o(10, 21));
		System.out.println(c.divis�o(12, 2));
	}

}
