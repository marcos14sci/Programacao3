package br.edu.uniformg.soccer;

import java.util.ArrayList;

public class Time {
	
	public ArrayList<Jogador> jogadores = new ArrayList<>();
	public String nome;	
	public String estado;
	
	
	public Time() {
		
		this.nome = ""; 
		this.estado = "";
		
	}
	
	public void adicionarJogador(Jogador j) {
		
		this.jogadores.add(j);
		
	}
	
	public void excluirJogador(int i) {
		
		this.jogadores.remove(i);
		
	}
	

}
