package Gun10;

import java.util.Scanner;

public class _09_06_Odev {
    public static void main(String[] args) {
        // Kullanıcının bir yeni şifre girmesini isteyiniz, şifrenin uzunluğu 8'den küçük ise, şifreniz kabul edilmedi yazsın
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir şifre giriniz= ");
        String sifre=oku.nextLine();

        if (sifre.length()<8){
            System.out.println("Şifreniz kabul edilmedi");
        }
        else {
            System.out.println("Şifreniz kabul edildi");
        }
    }
}
