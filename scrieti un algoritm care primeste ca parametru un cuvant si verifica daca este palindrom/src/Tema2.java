//scrieti un algoritm care primeste ca parametru un cuvant si verifica daca este palindrom
//    "ANA" -> OKAY
//    "BAHAB" -> OKAY
//    "LABTRRTBAL" -> OKAY
//    "PASTOR" -> NOT OKAY
//    "KINDER" -> NOT OKAY

class Tema2 {

    void palindrom(String st[]) {
        boolean bo = false;

        LOOP:
        for (int i = 0; i < st.length / 2; i++) {

            if (st[i].equals(st[st.length - i - 1]))

                bo = true;
            else {
                bo = false;
                break LOOP;
            }
        }

        if (bo == true)
            System.out.println("OKAY");
        else
            System.out.println("NOT OKAY");

    }


    //alta metoda mai simpla
    void palindrom1(String a) {

        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }

        if (a.equals(b))
            System.out.println("OKAY");
        else
            System.out.println("NOT OKAY");

    }
}

