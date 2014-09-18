package br.edu.uniformg.soccer;

import java.util.ArrayList;

public class Campeonato {
	
	public ArrayList<Jogo> brasileiro = new ArrayList<>();
	public int ano;
	
	
	public Campeonato() {
						
		this.ano = 0;	
		
	}
	
	public void adicionarJogo(Jogo j) {
		
		this.brasileiro.add(j);		
		
	}
	

}
