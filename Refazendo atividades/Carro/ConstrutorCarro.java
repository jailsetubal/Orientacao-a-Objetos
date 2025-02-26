package Carro;

public class ConstrutorCarro {
    public static void main(String[] args) {
        
        // Criação do objeto Carro
        Carro car = new Carro(0, 10);

        // Utilizando método Abastecer
        car.abastecer(50);

        // Mostrando valor do combustível atualizado
        System.out.println("\n" + car.getCombustivel());

        // Utilizando o método Andar
        car.andar(100);

        // Mostrando combustível atualizado
        System.out.println(car.getCombustivel());
    }
}
