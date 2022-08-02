package Gun16;

import java.util.Scanner;

public class _12_Odev {
    public static void main(String[] args) {
        // Kullanıcının girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığnı bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi= oku.nextInt();

        int ilkBasamak=sayi%10;
        int sonBasamak=0;
        while (sayi>9){
            sayi=sayi/10;
        }
        sonBasamak=sayi;
        System.out.println("ilk basamak= "+ilkBasamak);
        System.out.println("son basamak= "+sonBasamak);

        if (ilkBasamak==sonBasamak)
            System.out.println("Eşit");
        else System.out.println("Eşit değil");

    }
}
