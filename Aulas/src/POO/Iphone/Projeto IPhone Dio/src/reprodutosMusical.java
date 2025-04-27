import java.util.Scanner;

public class reprodutosMusical {
    Scanner scanner = new Scanner(System.in);
    String musica;
    public reprodutosMusical() {
        escolherMusica();
    }
    public void escolherMusica(){
        System.out.println("Escolha a música que você deseja ouvir");
        musica = scanner.nextLine();
    }
    public void tocar(){
        System.out.println("Tocando "+ musica);
    }
    public void pausar(){
        System.out.println("Pausando "+ musica);
    }
    
}
