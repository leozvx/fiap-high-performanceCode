package Teste;

import pilhas.PilhaInt;

public class MainTeste {

	public static void main(String[] args) {
		
		PilhaInt pilhas = new PilhaInt();
		
		pilhas.init();
		pilhas.push(10);
		pilhas.push(12);
		System.out.println(pilhas.pop());
		System.out.println(pilhas.pop());
		
		
		
		
		
	}

}
