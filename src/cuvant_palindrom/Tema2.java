//scrieti un algoritm care primeste ca parametru un cuvant si verifica daca este palindrom
//    "ANA" -> OKAY
//    "BAHAB" -> OKAY
//    "LABTRRTBAL" -> OKAY
//    "PASTOR" -> NOT OKAY
//    "KINDER" -> NOT OKAY

package cuvant_palindrom;

public class Tema2 {

    public boolean isPalindrom(String st[]) {


        for (int i = 0; i < st.length / 2; i++) {

            if (!st[i].equals(st[st.length - i - 1])) {

                return false;
            }

        }
        return true;
    }


    //alta metoda mai simpla
    public boolean isPalindrom1(String a) {

        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }

        System.out.print(a+" ---> ");
        if (a.equals(b))
            return true;
        else
            return false;
    }

}

