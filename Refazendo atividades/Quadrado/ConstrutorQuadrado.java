package Quadrado;

public class ConstrutorQuadrado {
    public static void main(String[] args) {

        //Criação de objeto
        Quadrado square = new Quadrado(5);

        //Retorna o valor do Lado
        System.out.println(square.getLado());

        //Retorna o método que calcula a área do quadrado
        System.out.println(square.calcularArea());

        //Altera o valor do Lado
        square.setLado(10);

        //Retorna o valor do Lado
        System.out.println(square.getLado());

        //Retorna o método que calcula a área do quadrado
        System.out.println(square.calcularArea());
    }
}
