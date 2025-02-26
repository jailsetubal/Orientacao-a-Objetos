package ControleTV;

public class ConstrutorControleTV {
    public static void main(String[] args) {
        
        // Criação do objeto ControleTV
        ControleTV control = new ControleTV(10, 20);

        // Mostrando valor do canal e volume
        System.out.println("\n" + control.getCanal());
        System.out.println(control.getVolume());

        // Alterando o valor do canal
        control.setCanal(3);

        // Mostrando novo valor do canal
        System.out.println(control.getCanal());

        // Utilizando método para aumentar o volume 
        control.aumentarVolume();
        control.aumentarVolume();

        // Método para diminuir o volume
        control.reduzirVolume();

        // Mostra o valor do volume novamente
        System.out.println(control.getVolume());
    }
}
