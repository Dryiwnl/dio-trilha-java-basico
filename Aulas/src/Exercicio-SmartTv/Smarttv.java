public class Smarttv{

        boolean ligada = false;
        int canal=1, volume=1;

        boolean ligar(){
            ligada = true;
            return ligada;
        }
    
        boolean desligar(){
            ligada = false;
            return ligada;
        }
         int aumentar_volume(){
            return volume++;
        }
        int abaixar_volume(){
            return volume --;
        }
        int mudar_canal(int novo_canal){
            canal = novo_canal;
            return canal;
        }
    
}