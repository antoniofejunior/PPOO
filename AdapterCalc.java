
public class AdapterCalc extends CalculadoraAtual {
	
	private JavaCalculator jc;
	
	public AdapterCalc(JavaCalculator j){
		jc = j;
	}
	
	public float soma(float a, float b){
		return jc.sum(a, b);
	}
	
	public float subtração(float a, float b){
		return jc.sub(a, b);
	}
	
	public float divisão(float a, float b){
		return jc.div(a, b);
	}
	
	public float multiplicação(float a, float b){
		return jc.mul(a, b);
	}
}
