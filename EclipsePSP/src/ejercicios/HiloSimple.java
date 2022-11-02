package ejercicios;



public class HiloSimple extends Thread {
    public void run(){
        for (int i = 0; i < 500; i++) {
            System.out.println("En el hilo...");
        }
    }

    //para usar el main

    public static void main(String [] args){

        HiloSimple hs = new HiloSimple();
            hs.start();
            for(int i =0; i<500; i++){
                System.out.println("Fuera del hilo ..");
            }
        }     
}
