package br.edu.uniformg.soccer;

public class Jogador {
	
	
	public String nome;	
	public boolean status;	
	public float altura;	
	public int idade;
	
	
	
	public Jogador() {
		
		this.nome = "";
		this.status = true;
		this.altura = 0;
		this.idade = 0;	
		
	}
	
	public void alteraStatus(boolean status) {
		
		this.status = status;		
		
	}
	
	public void alteraIdade(int idade) {
		
		this.idade = idade;		
		
	}
	
	
	
	

}
