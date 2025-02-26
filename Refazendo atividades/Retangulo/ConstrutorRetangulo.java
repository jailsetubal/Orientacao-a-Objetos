package Retangulo;

public class ConstrutorRetangulo {
    public static void main(String[] args) {

        // Criação do objeto Retangulo
        Retangulo rectangle = new Retangulo(5, 7);

        // Mostra o valor da base e altura
        System.out.println("\n" + rectangle.getBase());
        System.out.println(rectangle.getAltura());

        // Mostra o valor da área e do perímetro
        System.out.println(rectangle.calcularArea());
        System.out.println(rectangle.calcularPerimetro());

        // Alterando valor da base e Altura
        rectangle.setBase(2);
        rectangle.setAltura(5);

        // Mostrando o valor da base e altura
        System.out.println(rectangle.getBase());
        System.out.println(rectangle.getAltura());

        // Mostrando valor da área e do perímetro
        System.out.println(rectangle.calcularArea());
        System.out.println(rectangle.calcularPerimetro());
    }
}
