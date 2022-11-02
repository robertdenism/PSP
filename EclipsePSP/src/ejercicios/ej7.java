package ejercicios;

import java.util.Scanner;

public class ej7 {
    public static void main(String []args) {

        System.out.println("Introduzca parametros");
        Scanner teclado = new Scanner(System.in);

        String introducido = teclado.nextLine();
        

        while(introducido!="*"){
            System.out.println("Indtroduzca otra linea");
            introducido=teclado.nextLine();
            
        }
        teclado.close();
    }
}
