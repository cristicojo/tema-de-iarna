//Sa se citeasca un numar N de la tastatura.
//    Sa se citeasca N array-uri de 4 cifre.
//
//    Sa se calculeze care array-uri sunt fericite.
//    Un array este fericit cand suma cifrelor este para si cel putin un numar din array este par.
//
//    Sa se calculeze care array-uri sunt nefericite.
//    Un array este nefericit cand produsul cifrelor este impar si cel putin un numar impar.
//
//    [1,3,6] -> Fericit
//    [1,3,5] -> Nu este fericit
//    [7,7] -> Nefericit
//    [5] -> Nu este nefericit

import java.util.Scanner;

class Tema3 {
    private Scanner s;

    {
        s = new Scanner(System.in);
    }

    {
        System.out.print("Dati nr de sloturi din array=");
    }

    private int n = s.nextInt();
    private int a[] = new int[n];


    void conditie() {

        for (int i = 0; i < a.length; i++) {

            if (a[i] < 999) {
                System.out.println("dati toate nr din array de 4 cifre!!!!");
                citire();
            }
        }
    }


    public void citire() {

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = s.nextInt();
        }

    }


    void afisare() {

        for (int z : a) {
            System.out.print(z + " ");
        }
        System.out.println();
    }

    public void fericit_nefericit() {
        int okS = 0, okS1 = 0;
        int okP = 0, okP1 = 0;
        int Stotal = 0;
        int Ptotal = 1;

        for (int i = 0; i < a.length; i++) {

            okS = 0;
            okP = 0;
            int Scifre = 0;
            int Pcifre = 1;
            int temp = a[i];

            while (a[i] != 0) {

                int r = a[i] % 10;

                a[i] = a[i] / 10;

                Scifre = Scifre + r;

                Pcifre = Pcifre * r;

            }
            Stotal = Stotal + Scifre;
            Ptotal = Ptotal * Pcifre;
            System.out.println("suma cifrelor pt " + temp + " este " + Scifre);
            System.out.println("produsul cifrelor pt " + temp + " este " + Pcifre);


            if (Stotal % 2 == 0) {

                okS = 1;
            }

            if (temp % 2 == 0) {

                okS1 = 1;
            }

            if (Ptotal % 2 != 0) {

                okP = 1;
            }

            if (temp % 2 != 0) {

                okP1 = 1;
            }


        }
        System.out.println("suma totala este " + Stotal);
        System.out.println("produsul total este " + Ptotal);

        if ((okS == 1) && (okS1 == 1))
            System.out.println("Array Fericit");
        else if ((okP == 1) && (okP1 == 1))
            System.out.println("Array NEfericit");
        else
            System.out.println("Array Normal");


    }
}






