package Gun11;

import java.util.Scanner;

public class _09_IfElse {
    public static void main(String[] args) {
        //girilen yeni bir bir password un kurallara uygunluğunu kontrol ediniz
        //kurallar= 1) en az 8 karakter olmalı, 2) içinde pass kelimesi olmamalı 3) en fazla 12 karakter olmalı

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir password giriniz= ");
        String pw=oku.next();
        pw.toLowerCase().contains("pass"); // geçiyorsa true, geçmiyorsa false

        //!pw.toLowerCase().contains("pass") geçiyor değilse ile
        // // !pw.toLowerCase().contains("pass")==false aynı sonucu verir

        if (pw.length()>=8 && pw.length()<=12 && !pw.toLowerCase().contains("pass"))
        {System.out.println("Geçerli password ");}
        else {System.out.println("Geçersiz password");}
    }
}
