package Gun05;

import java.util.Scanner;

public class _11_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak, PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Cadde=");
        String cadde=oku.next();

        System.out.print("Sokak=");
        String sokak=oku.next();

        Scanner oku2=new Scanner(System.in); // String lerin arasında birtane int olursa ayrıca okuma yaptırılmalı
        System.out.print("PostaKodu=");
        int postaKodu=oku2.nextInt();

        System.out.print("Ulke=");
        String ulke=oku.next();

        System.out.println("Adres: "+cadde+", "+sokak+", "+postaKodu+", "+ulke);
    }
}
