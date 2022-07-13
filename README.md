### Questão de prova do curso de Análise e Desenvolvimento de Sistemas, disciplina de Programação Orientada a Objetos.

---
## **Enunciado**
---
Considere a classe Ponto para representar uma coordenada (x,y) , a classe possui o método igual(Ponto p) que verifica se dois pontos são iguais, o método recebe um parâmetro de forma explícita (Ponto p) e outro de forma implícita.

public class Ponto {
    private int x,y;
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean igual(Ponto p) {
        return this.x == p.x && this.y == y;
    }
}

A seguir temos a classe Circulo para representar a figura geométrica círculo, note que a classe Circulo foi modelada usando herança, o centro do círculo será uma coordenada (x,y) definida na classe pai e raio é um atributo float.

public class Circulo extends Ponto {
    private float raio;
    public Circulo(int x, int y, float raio) {
        super(x, y);
        this.raio = raio;
    }
}

A sua tarefa é finalizar a implementação da classe Circulo sobrescrevendo o método igual() da classe Ponto para que agora o método verifique se dois círculos são iguais, ou seja, se estão na mesma coordenada (x,y) e se tem o mesmo raio. Nesse exercício não é permitido modificar a classe Ponto para atender as necessidades da classe Circulo.