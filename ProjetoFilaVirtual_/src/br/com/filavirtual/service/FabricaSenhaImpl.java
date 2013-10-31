package br.com.filavirtual.service;

public class FabricaSenhaImpl implements FabricaDeSenhas{

	static int senha = 0;
	
	@Override
	public int valorSenha() {
		senha++;
		return senha;
	}

	@Override
	public String gerarSenha() {
		// TODO Auto-generated method stub
		valorSenha();
		return "FV-"+senha;
	}

}
