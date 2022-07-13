package prova_poo_java;

public class Circulo extends Ponto {
	private float raio;
	public Circulo(int x, int y, float raio) {
		super(x,y);
		this.raio = raio;
	}
	
//A classe Circulo representa a figura 
//geom�trica c�rculo. Note que a classe Circulo foi 
//modelada usando heran�a, o centro do c�rculo ser� uma 
//coordenada (x,y) definida na classe pai e raio � um 
//atributo float.
	
//A sua tarefa � finalizar a implementa��o da classe 
//Circulo sobrescrevendo o m�todo igual() da classe Ponto 
//para que agora o m�todo verifique se dois c�rculos 
//s�o iguais, ou seja, se est�o na mesma coordenada (x,y) 
//e se tem o mesmo raio. Nesse exerc�cio n�o � permitido 
//modificar a classe Ponto para atender as necessidades 
//da classe Circulo.
	
//Resposta:
	
	@Override
	public boolean igual(Ponto p){
		Circulo c = (Circulo) p;
		return super.igual(p) && this.raio == c.raio;
		}
	
}
