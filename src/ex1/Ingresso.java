package ex1;

public class Ingresso {
	
	private String identificador = gerarIdentificador();
	private float valor;
	static int cont = 0;
	
	public Ingresso (float valor) {
		this.valor = valor;
	}
	
	public static String gerarIdentificador() {
		cont++;
	    return "ID" + cont;
	}
	
	
	
	public float valorFinal (float taxa) {
		float valorFinal = getValor() + (getValor() * (taxa/100));
		return valorFinal;
	}



	public String getIdentificador() {
		return identificador;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
