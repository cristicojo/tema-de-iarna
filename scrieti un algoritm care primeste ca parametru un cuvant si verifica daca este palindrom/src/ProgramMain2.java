import java.util.Arrays;
import java.util.Scanner;

public class ProgramMain2{

    public static void main(String[] args) {
        Tema2 t2 = new Tema2();
        String st[] = {"r", "a", "b", "t", "r", "r", "t", "b", "a","l"};

        System.out.println(Arrays.toString(st)+" ---> "+t2.isPalindrom(st));


//        Scanner s=new Scanner(System.in);
//
//        String str[]=new String[5];
//        for (int i=0;i<str.length;i++){
//            System.out.print("str["+i+"]=");
//            str[i]=s.nextLine();
//        }
//
//        for (String z:str)
//            System.out.print(z);

        //System.out.println(" ---> "+t2.isPalindrom(str));


        //System.out.println(t2.isPalindrom1("bahaB"));


    }
}
