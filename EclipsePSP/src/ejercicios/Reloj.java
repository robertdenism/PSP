package ejercicios;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Reloj extends JFrame{
	public static void main(String[] args) {
		new Reloj();
	}
	
	
	
	
	public Reloj() {
		
		
		super("MI PRIMERA VENTANA");
		
		//creamos boton y labble
		JLabel l = new JLabel();
		JButton b = new JButton("Pulsame");
		JButton bPara = new JButton("PARAR");
		
		
		//seteamos la vista de la ventana
		setLayout(new FlowLayout());
		
		//añadimos al contenido del panel label y boton
		
		getContentPane().add(l);
		getContentPane().add(b);
		getContentPane().add(bPara);
		
		//modificamos el texto del boton
		l.setText("Hola Mundo");
		
		//tamaño de la ventana y visibilidad
		setSize(500, 400);
		setVisible(true);
		
		
		// modificamos para cuando se pulse y se modifique texto
		
		Contador c = new Contador(l);
		Thread t = new Thread(c);
		
		
		bPara.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t.stop();
			}
		});
		
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t.start();
			}
		});
		
	}

}