package Gun14;
public class _02_WhileLoop {
    public static void main(String[] args) {
        // ekrana 5 kez merhaba yazdırınız.
        int sayac=0;
        //sayac 5 den küçükken
        while (sayac<5){//şart sağlanıyorsa parantezlerin arasını çalıştır. while--iken demek
            System.out.println("Merhaba= "+sayac);
            sayac++;
        }
    }
}