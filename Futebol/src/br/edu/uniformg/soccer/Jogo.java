package br.edu.uniformg.soccer;

public class Jogo {
	
	public Time time1;	
	public Time time2;	
	public int vencedor;
	public Data data;
	
	
	public Jogo() {
		
		this.time1 = new Time();
		this.time2 = new Time();
		this.vencedor = 0;
		this.data = new Data();
			
		
	}
	
	public void adicionarVencedor(int vencedor) {
		
		this.vencedor = vencedor;	
		
	}
	
	
	
	
	

}
