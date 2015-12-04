package boletin12_1;
//Yasmin

import java.util.Scanner;

public class Garaxe {

    int numeroCoches;
    String matricula;

    public void aparcaCoche() {
        Scanner coche = new Scanner(System.in);
        do {
            if (numeroCoches <= 5) {
                System.out.println("Prazas dispoñibles");
                numeroCoches++;
                System.out.print("Matricula coche: ");
                matricula = coche.next();
            }
            
        } while (numeroCoches <= 4);
        System.out.println("Completo");

    }
    
    public void prezoAparcar(){
        Scanner matri=new Scanner(System.in);
        System.out.println("Introduce la matricula ");
        matricula=matri.next();
        System.out.println("FACTURA ");
        System.out.println("MATRICULA COCHE: "+matricula);
        Scanner t=new Scanner(System.in);
         System.out.println("Tempo: ");
        double tempo=t.nextDouble();
        double precio=tempo=1.5;
        precio=0.20+tempo;
       
        System.out.println("PRECIO: "+precio);
        
    }
    
}
