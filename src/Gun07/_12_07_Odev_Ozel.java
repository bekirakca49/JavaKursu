package Gun07;

import java.util.Scanner;

public class _12_07_Odev_Ozel {
    public static void main(String[] args) {
        // 1- Girilen bir cümlede kaç kelime olduğunuz bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("lütfen bir cümle giriniz: ");
        String text=oku.nextLine();

        int uzunluk1=text.length();
        String text2=text.replace(" ", "");
        int uzunluk2=text2.length();
        int kelimeSayisi=uzunluk1-uzunluk2+1;

        System.out.println("Kelime Sayisi= " + kelimeSayisi);
    }
}
