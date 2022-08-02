package Gun19;
import java.util.Scanner;
public class _06_01_Odev {
    public static void main(String[] args) {
        //1- Kullanıcıdan yaş bilgisini isteyiniz
        //Eğer yaş 10 dan küçük veya eşit ise
        //"facebook hesabi acmak icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 16 dan küçük veya eşit ise
        //"ehliyet almak icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 18 den küçük veya eşit ise
        //"dovme yaptirmak icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 21 den küçük veya eşit ise
        //"alkol icmek icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 21 den büyük ise
        //"istediğini yapabilirsin" şeklinde yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir yaş giriniz= ");
        int yas=oku.nextByte();
        if (yas<=10)
            System.out.println("Facebook hesabı açmak için çok gençsin");
        if (yas<=16)
            System.out.println("Ehliyet almak için çok gençsin");
        if (yas<=21)
            System.out.println("Alkol almak için çok gençsin");
        if (yas>21)
            System.out.println("İstediğinizi yapalirsiniz");
    }
}
