package ejemploSinc;

public class CompartirInf1 {
	public static void main(String[] args) throws InterruptedException {
		Contador contador = new Contador(100);
		HiloA a = new HiloA( "HiloA", contador) ;
		HiloB b = new HiloB( "HiloB", contador);
		
		
		a.start();
		b.start();
		
		// 1º.- ¿Qué ocurre?
		
		a.join();
		b.join();
		
		System.out.println("Contador vale " + contador.valor());
	}
}