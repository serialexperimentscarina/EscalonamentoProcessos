package model;

public class Processo {

	public String nome;
	public int qtdRetornos;
	
	@Override
	public String toString() {
		return ("[Nome: " + nome + ", Retornos faltando: " + qtdRetornos + "]");
	}
	
}
