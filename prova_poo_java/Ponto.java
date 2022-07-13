//Considere a classe Ponto para representar uma 
//coordenada (x,y) , a classe possui o m�todo 
//igual(Ponto p) que verifica se dois pontos s�o iguais, 
//o m�todo recebe um par�metro de forma expl�cita (Ponto p) 
//e outro de forma impl�cita.

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