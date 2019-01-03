//scrieti un algoritm care sa calculeze sumele elementelor a doua array-uri si sa printeze daca sumele elementelor sunt egale.
//    -trebuie cel putin 3 exemple care sa arate ca algoritmul este corect.
//    -acest algormit trebuie sa fie scris intr-o clasa separata, cu metode unde este cazul
//
//    [1,3,5] | [9,0] -> OKAY
//    [1,1,1,1,1] | [1,1,1,1,1,1] -> NOT OKAY.


import java.util.Scanner;

class Tema1 {
    Scanner s;

    Tema1() {
        s = new Scanner(System.in);
    }

    void write() {
        int a[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = s.nextInt();
        }

        System.out.print("primul array:");
        for (int y : a) {
            System.out.print(y + " ");
        }
        System.out.println();

        int S1 = 0;
        for (int i = 0; i < a.length; i++) {

            S1 = S1 + a[i];
        }

        System.out.println("suma elem pt primul array este:" + S1);
        int b[] = new int[6];

        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "]=");
            b[i] = s.nextInt();
        }

        System.out.print("al doilea array:");
        for (int z : b) {
            System.out.print(z + " ");
        }
        System.out.println();

        int S2 = 0;
        for (int i = 0; i < b.length; i++) {

            S2 = S2 + b[i];
        }
        System.out.println("suma elem pt al doilea array este:" + S2);

        if (S1 == S2)
            System.out.println("OKAY");
        else
            System.out.println("NOT OKAY");


    }
}