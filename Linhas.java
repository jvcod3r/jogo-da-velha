package jogodavelha;

public class Linhas {

	char[][]linhas = new char[3][3];
	char jogadorAtual = 'X';
	
	public boolean iniciartabuleiro()	{
		for(int i = 0; i < linhas.length; i++) {
			for(int j =0; j < linhas[i].length; j++){
				linhas[i][j] = '-';	
			}
		}
		return true;
	}
	public void imprimirlinhas(){
		for(int i = 0; i < linhas.length; i++) {
			for(int j =0; j < linhas[i].length; j++){
				
				System.out.print(linhas[i][j]  + " ");
				}
			System.out.println();
		}
		
	}	   
	
	boolean veririfcarJogada(int linha, int coluna) {
		
			
	
		return true;
	}
	boolean veririficarVitoria(){
		for(int i = 0; i < 3; i++) {
		if(linhas[i][0] == jogadorAtual && linhas[i][1] == jogadorAtual && linhas[i][2] == jogadorAtual){
			return true;
		}
		 }
		for(int j = 0; j < 3; j++) {
			if(linhas[0][j] == jogadorAtual && linhas[1][j] == jogadorAtual && linhas[2][j] == jogadorAtual) {
			return true;}
		}
		if(linhas[0][0] == jogadorAtual && linhas[1][1] == jogadorAtual && linhas[2][2] == jogadorAtual) {
			return true;
		}
		if(linhas[0][2] == jogadorAtual && linhas[1][1] == jogadorAtual && linhas[2][0] == jogadorAtual) {
			return true;
		}
		else {
			return false;
		}
		 }
	
		

	boolean verificarempate(){
		if(!veririficarVitoria()) {
		for(int i = 0; i < linhas.length; i++) {
			for(int j =0; j < linhas[i].length; j++){
				if(linhas[i][j] == '-' ) {
					return false;
				}	
				
		}
		 }
		return true;
		  }
			else {
			return false;
			}}
		
	char alternarjogador() {
		return jogadorAtual = 'O';

	}
	
	
	boolean fazerjogada(int linha, int coluna, char jogadorAtual){
		this.jogadorAtual = jogadorAtual;
		if(linha >= 0 && linha <= 3 && coluna >=0 && coluna <= 3) {
		if( linhas[linha][coluna] == '-') {
			linhas[linha][coluna] = jogadorAtual;
			return true;
		}
		else {
			System.out.println("Posição ocupada!");
		}
		 }
		else {
			System.out.println("Jogada Inválida!");
		}
		return false;
	   
	}

	 }
	

