package Gun13;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        //toylama için T, Çıkarma icçin Ç, Çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp sonucu yazdırınız (switch kullanınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("1.Sayı =");
        int s1= oku.nextInt();
        System.out.print("2.Sayı =");
        int s2= oku.nextInt();

        Scanner oku2=new Scanner(System.in);
        System.out.print("İşlemi giriniz =");
        String islem= oku2.next(); //String tipinde

        switch (islem.toUpperCase()){
            case "K": System.out.println("Toplam (K)= "+(s1+s2));break;
            case "Ç": System.out.println("Çıkarma (Ç)= "+(s1-s2));break;
            case "P": System.out.println("Çarpma (P)= "+(s1*s2));break;
            case "B": System.out.println("Bölme (B)= "+(s1/s2));break;
            default:System.out.println("Geçerli bir giriş yapmadınız");break;}
    }
}
