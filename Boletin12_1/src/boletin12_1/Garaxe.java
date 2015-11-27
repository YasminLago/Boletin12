package boletin12_1;
//Yasmin

import java.util.Scanner;


public class Garaxe {

    int numeroCoches;
    String matricula;
    int plazas = 0;

    public void aparcaCoche() {
       Scanner coche=new Scanner(System.in);
       System.out.print("Matricula coche: ");
       matricula=coche.next();
        do {
            System.out.println("Prazas dispoñibles");
            plazas++;
            break;
        } while (numeroCoches <= 5);
        System.out.println("Completo");

    }

    public void prezoAparcar() {

    }
}
