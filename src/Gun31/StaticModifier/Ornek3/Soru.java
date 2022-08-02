package Gun31.StaticModifier.Ornek3;

public class Soru {
    int a; // Class'ın içinde ama nesneye ait. Nesne oluşturarak ancak ulaşılabilir.
    static int b=0; // sen bi tanesin denmiş oldu.
    void artir(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        Soru s1=new Soru();
        s1.a=5;

        Soru s2=new Soru();
        s2.a=7;
        // a nın değeri kaç oldu şu anda: Burada verilecek cevap hangi a yı soruyorsunuz olmalı.
        System.out.println("s1 = " + s1.a); // 5
        System.out.println("s2 = " + s2.a);// 7

        Soru.b=6; // Clas a ait direk Class ismi ile ulaşılabilmektedir.
        Soru.b=8;// en son atıl değer bu olduğu için b nin değeri 8'dir.
        // Soru b nin değeri kaçtır: tek bir değeri ardır en son değer.
        System.out.println("Soru.b = " + Soru.b);

        s1.artir();// s1 a=6, b=9
        s2.artir(); // s2 a=8, b=10
        // Soru a nın ve b nin en son değerleri kaçtır.

        System.out.println("s1 = " + s1.a);
        System.out.println("s2 = " + s2.a);
        System.out.println("Soru.b = " + Soru.b);
    }
}
