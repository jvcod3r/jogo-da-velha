package jogodavelha;

public class jogodaVelha {

	public static void main(String[] args) {
		Linhas l = new Linhas();	
		
		l.iniciartabuleiro();
		l.fazerjogada(0, 0, 'X');
		l.imprimirlinhas();
		System.out.println("temos um vencedor?" + l.veririficarVitoria());		System.out.println("");
		l.fazerjogada(1, 1, l.alternarjogador());
		l.imprimirlinhas();
		System.out.println("temos um vencedor?" + l.veririficarVitoria());		System.out.println("");
		l.fazerjogada(0, 1, 'X');
		l.imprimirlinhas();
		l.fazerjogada(0, 2, 'X');
		l.imprimirlinhas();
		System.out.println("temos um vencedor?" + l.veririficarVitoria());
		
		
	}
}
