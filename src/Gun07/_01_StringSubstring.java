package Gun07;

public class _01_StringSubstring {
    public static void main(String[] args) {
        // String in belli bir bölümünü alma işlemini yapar.
                // 012345678901234567
        String s1="Merhaba arkadaşlar";
        String parca1=s1.substring(2,6); // 2 nolu indexten 6 ya kadar al. 6 dahil değil.
        System.out.println("parca1 = " + parca1);

        System.out.println("2.bolum arkadaş= "+s1.substring(8,15));
        System.out.println("3.bolum arkadaşlar= "+s1.substring(8));
        // verilen yerden başlayarak sonuna kadar alır.
        System.out.println("4.bolum arkadaşlar= "+s1.substring(s1.indexOf(" ")+1));
        System.out.println("4.bolum arkadaşlar= "+s1.substring(s1.indexOf(0)+1, s1.indexOf(" ")));
    }
}
