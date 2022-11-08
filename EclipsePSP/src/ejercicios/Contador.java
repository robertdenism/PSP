package ejercicios;

import javax.swing.JLabel;

public class Contador implements Runnable {
	private static final long INTERVALO = 100;
	JLabel _salida;
	int contador = 0;

	public Contador(JLabel salida) {
		_salida = salida;
	}

	@Override
	public void run() {

		try {
			while (true) {
				contador++;
				_salida.setText(Integer.toString(contador));
				Thread.sleep(INTERVALO);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
