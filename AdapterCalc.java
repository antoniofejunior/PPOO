
public class AdapterCalc extends CalculadoraAtual {
	
	private JavaCalculator jc;
	
	public AdapterCalc(JavaCalculator j){
		jc = j;
	}
	
	public float soma(float a, float b){
		return jc.sum(a, b);
	}
	
	public float subtra��o(float a, float b){
		return jc.sub(a, b);
	}
	
	public float divis�o(float a, float b){
		return jc.div(a, b);
	}
	
	public float multiplica��o(float a, float b){
		return jc.mul(a, b);
	}
}
