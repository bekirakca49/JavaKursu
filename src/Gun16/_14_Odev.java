package Gun16;

import java.util.Scanner;

public class _14_Odev {
    public static void main(String[] args) {
        //7-girilen bir cümledeki a harfi sayısını bulunuz.(Regex kullanmayın)
        Scanner oku=new Scanner(System.in);
        System.out.print("Cümleyi  giriniz= ");
        String  cumle= oku.nextLine();
        int miktar=0;

        for (int i=0;i<cumle.length();i++){
            if (cumle.charAt(i)=='a')
            miktar++;
        }
        System.out.println("Miktar= "+miktar);
    }
}
