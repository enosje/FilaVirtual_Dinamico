package br.com.filavirtual.teste;

import br.com.filavirtual.service.FabricaSenhaImpl;

public class TestarSenha {

	public static void main(String[] args) {
		
		FabricaSenhaImpl f = new FabricaSenhaImpl();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(f.gerarSenha());
		}
		
	}
	
}
