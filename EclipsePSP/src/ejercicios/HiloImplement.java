package ejercicios ;

public class HiloImplement implements Runnable {
    public void run(){
        for (int i = 0; i < 500; i++) {
            System.out.println("El hilo .. .");
            
        }
    }

    public static void main(String [] args) {
        HiloImplement hs = new HiloImplement();
        Thread t = new Thread(hs);
        t.start();
        for (int i = 0; i < 500; i++) {
            System.out.println("Fuera del hilo.. .");
        }
    }
}
