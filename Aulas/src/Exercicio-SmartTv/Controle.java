public class Controle{
    public static void main(String[] args){
        Smarttv smarttv = new Smarttv();
        

        smarttv.ligar();
        smarttv.aumentar_volume();
        smarttv.mudar_canal(44);
        System.out.println("Tv está ligada? " + smarttv.ligada);
        System.out.println("Tv está em qual canal? " + smarttv.canal);
        System.out.println("Tv está em qual volume? " + smarttv.volume);
        System.out.println("Canais possíveis: ");
        for(int i=1 ;i<smarttv.canal;i++){
            System.out.println("Canal "+i);
        }
        


    }

    

}