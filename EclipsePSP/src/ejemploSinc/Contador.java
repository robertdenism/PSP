package ejemploSinc;
class Contador {
	private int c = 0; //atributo contador
	Contador (int c) {
		this.c = c;
	}
	
	// 3º.- Posible sincro
	public synchronized void incrementa() {
		int tmp = c;
		tmp = tmp + 1;
		c = tmp;
	}
	
	// 3º.- Posible sincro
	public synchronized void decrementa() {
		int tmp = c;
		tmp = tmp - 1;
		c = tmp;
		
	}
	
	public int valor() {
		return c;
	}
}
