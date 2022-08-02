package Gun04;

public class _01_WideningCasting {
    public static void main(String[] args) {
            //byte -> short -> char -> int -> long ->float -> double     otamatik dönüştürme
        int sayi=9;
        long toplam=678;
        double oran=3.2;

        oran=sayi; // oran 9 olduğundan kayıp olmadı.
                    // bu dönüşüm genişleme yönünde olduğundan bunu Widening Casting denir
        System.out.println("oran = " + oran);

        toplam=sayi;
        System.out.println("toplam = " + toplam);
    }
}
