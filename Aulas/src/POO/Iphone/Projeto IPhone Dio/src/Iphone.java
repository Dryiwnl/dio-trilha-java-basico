import java.util.Scanner;
public class Iphone {
    Scanner scanner = new Scanner(System.in); 
    Iphone(){
        while(true){
            System.out.println("Qual app você quer acessar: ");
        System.out.println("[1] - Spotify");
        System.out.println("[2] - Mensagem");
        System.out.println("[3] - Safari");
        System.out.println("[4] - Sair");
        int opc = scanner.nextInt();
        switch(opc){
            case 1:
                reprodutosMusical spotify = new reprodutosMusical();
                spotify.tocar();
                spotify.pausar();
                break;
            case 2:
                aparelhoTelefonico mensagem = new aparelhoTelefonico();
                mensagem.ligar();
                mensagem.atender();
                mensagem.correioDeVoz();
                break;
            case 3: 
                Navegador safari = new Navegador();
                safari.exibirPagina();
                safari.adicionarNovaAba();
                safari.atualizarpagina();
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
    
        }
        }
        
        
        
        
    }

}
