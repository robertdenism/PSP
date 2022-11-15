package ejemploSinc;
class Contador {
	private int c = 0; //atributo contador
	Contador (int c) {
		this.c = c;
	}
	
	//synchronized solo puede ejecutar un thread a la vez
	
	// se añade synchronized al metodo incrementa
	public synchronized void incrementa() {
		int tmp = c;
		tmp = tmp + 1;
		c = tmp;
	}
	
	//se añade synchronized al metodo decremente
	public synchronized void decrementa() {
		int tmp = c;
		tmp = tmp - 1;
		c = tmp;
		
	}
	
	public int valor() {
		return c;
	}
}
