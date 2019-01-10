//scrieti un algoritm care sa calculeze sumele elementelor a doua array-uri si sa printeze daca sumele
//elementelor sunt egale.
//    -trebuie cel putin 3 exemple care sa arate ca algoritmul este corect.
//    -acest algormit trebuie sa fie scris intr-o clasa separata, cu metode unde este cazul
//
//    [1,3,5] | [9,0] -> OKAY
//    [1,1,1,1,1] | [1,1,1,1,1,1] -> NOT OKAY.

package printati_daca_suma_elementelor_a_2_arrayuri_este_egala;

import java.util.Scanner;

public class Tema1 {
    private Scanner s;
    private int a[]=new int[5];
    private int b[]=new int[6];
    private int S1=0;
    private int S2=0;

    public Tema1() {
        s = new Scanner(System.in);
    }


    public void calculare(){

        S1=0;
        S2=0;
        for (int i = 0; i < a.length; i++) {

            S1 = S1 + a[i];
        }

        System.out.println("suma elem pt primul array este:" + S1);

        for (int i = 0; i < b.length; i++) {

            S2 = S2 + b[i];
        }
        System.out.println("suma elem pt al doilea array este:" + S2);


    }

    public void citire() {


        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = s.nextInt();
        }
        System.out.println("al doilea array ----------");
        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "]=");
            b[i] = s.nextInt();
        }

        System.out.print("primul array:");
        for (int y : a) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.print("al doilea array:");
        for (int z : b) {
            System.out.print(z + " ");
        }
        System.out.println();

    }

    public void afisare(){
        if (S1 == S2)
            System.out.println("OKAY");
        else
            System.out.println("NOT OKAY");
    }
}