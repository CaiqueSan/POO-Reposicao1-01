package ex1;

public class VendaIngresso {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso(0);
		IngressoVIP ingressoVIP = new IngressoVIP(0);
		
		ingresso.setValor(20);
		ingressoVIP.setValor(20);
		
		System.out.println("ID: " + ingresso.getIdentificador() +
				"\nValor Ingresso comum: " + ingresso.valorFinal(10) +
				"\n");
		
		System.out.println("ID: " + ingressoVIP.getIdentificador() +
				"\nValor Ingresso VIP: " + ingressoVIP.valorFinal(10) +
				"\n");
		
		
		

	}

}


