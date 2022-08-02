package Gun16;

import java.util.Scanner;

public class _15_Odev {
    public static void main(String[] args) {
        //8-girilen bir cümledeki kelime sayısını bulunuz (regex kullanmayın)
        Scanner oku=new Scanner(System.in);
        System.out.print("Cümleyi  giriniz= ");
        String  cumle= oku.nextLine();
        int miktar=0;

        for (int i=0;i<cumle.length();i++)
        {
            if (cumle.charAt(i)==' ')
            miktar++;
        }
        System.out.println("Miktar= "+(miktar+1));
    }
}
