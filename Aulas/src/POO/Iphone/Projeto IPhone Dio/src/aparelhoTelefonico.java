import java.util.Scanner;

public class aparelhoTelefonico {
    Scanner scanner  = new Scanner(System.in);
    public void ligar(){
        System.out.println("Informe o número de quem você deseja ligar: ");
        String numero = scanner.nextLine();
        System.out.println("Ligando para "+numero);
    }
    public void atender(){
        System.err.println("Você está recebendo uma ligação, deseja atender?[s/n]");
        String _opc = scanner.nextLine();
        char  opc = _opc.charAt(0);
        if(opc == 's'){
            System.out.println("Ligação atendida!");
        }
        else{
            System.out.println("Ligação resucada!");
        }
    }
    public void correioDeVoz(){
        System.out.println("Informe qual mensagem você deseja deixar no correio de voz: ");
        String mensagem = scanner.nextLine();
        System.out.println("Informe o contato de quem vai receber a mensagem: ");
        String numero = scanner.nextLine();
        System.out.println("A mensagem '"+mensagem+"' foi enviada para o numero "+numero+".");
    }
}
