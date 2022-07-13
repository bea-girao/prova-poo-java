//Considere a classe Ponto para representar uma 
//coordenada (x,y) , a classe possui o método 
//igual(Ponto p) que verifica se dois pontos são iguais, 
//o método recebe um parâmetro de forma explícita (Ponto p) 
//e outro de forma implícita.

package prova_poo_java;

public class Ponto {
	private int x,y;
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean igual(Ponto p) {
		return this.x == p.x && this.y == p.y;
	}
}