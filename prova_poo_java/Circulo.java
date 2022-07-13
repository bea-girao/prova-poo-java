package prova_poo_java;

public class Circulo extends Ponto {
	private float raio;
	public Circulo(int x, int y, float raio) {
		super(x,y);
		this.raio = raio;
	}
	
//A classe Circulo representa a figura 
//geométrica círculo. Note que a classe Circulo foi 
//modelada usando herança, o centro do círculo será uma 
//coordenada (x,y) definida na classe pai e raio é um 
//atributo float.
	
//A sua tarefa é finalizar a implementação da classe 
//Circulo sobrescrevendo o método igual() da classe Ponto 
//para que agora o método verifique se dois círculos 
//são iguais, ou seja, se estão na mesma coordenada (x,y) 
//e se tem o mesmo raio. Nesse exercício não é permitido 
//modificar a classe Ponto para atender as necessidades 
//da classe Circulo.
	
//Resposta:
	
	@Override
	public boolean igual(Ponto p){
		Circulo c = (Circulo) p;
		return super.igual(p) && this.raio == c.raio;
		}
	
}
