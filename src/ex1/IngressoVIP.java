package ex1;

public class IngressoVIP extends Ingresso {
	public IngressoVIP (float valor) {
		super(valor);
	}
	String funcaoComprador;
	
	@Override
	public float valorFinal (float taxa) {
		float valorFinal = getValor() + (getValor() * (taxa/100));
		return valorFinal * 1.18f;
	}

	public String getFuncaoComprador() {
		return funcaoComprador;
	}

	public void setFuncaoComprador(String funcaoComprador) {
		this.funcaoComprador = funcaoComprador;
	}
	
}
