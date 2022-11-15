package ejemploSinc;

public class CompartirInf1 {
	public static void main(String[] args) throws InterruptedException {
		
		//inicializamos objeto contador objeto a y objeto b
		Contador contador = new Contador(100);
		HiloA a = new HiloA( "HiloA", contador) ;
		HiloB b = new HiloB( "HiloB", contador);
		
		
		//iniviamos los objetos
		
		a.start();
		b.start();
		
		
		//hacemos join al objeto a y b para que no ocurran compensadamente
		
		a.join();
		b.join();
		
		System.out.println("Contador vale " + contador.valor());
	}
}