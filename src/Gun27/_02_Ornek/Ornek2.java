package Gun27._02_Ornek;

public class Ornek2 {
    public static void main(String[] args) {
        // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
        // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
        // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
        // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.

        Rectangle masa1=new Rectangle();
        masa1.with=10;
        masa1.length=20;

        Rectangle masa2=new Rectangle();
        masa2.with=50;
        masa2.length=60;

        masa1.Cevre();
        masa2.Cevre();
        System.out.println("----------");
        masa1.Alan();
        masa2.Alan();

        System.out.println("----------");

        // exra return gerekseydi main içinde

        int alan1= masa1.Alan2();
        System.out.println("alan1 = " + alan1);

        int alan2= masa2.Alan2();
        System.out.println("alan2 = " + alan2);

    }
}
