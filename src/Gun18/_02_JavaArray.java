package Gun18;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // kullanıcının gireceği bir cümlede kaç kalime olduğunuz bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz= ");
        String cumle= oku.nextLine();
        int boslukSayisi=0;

        for (int i=0;i<cumle.length();i++){
            if (cumle.charAt(i)==' ')
                boslukSayisi++;
        }
        System.out.println("adet = " + (boslukSayisi+1));
    }
}
