package Gun06;

import Gun01.Merhaba;

public class _07_StringEquals {
    public static void main(String[] args) {
        // bir stringin birbirine eşit olup olmadığını kontrol eder. Sonuç boolean döner
        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMi=s1.equals(s2);
        System.out.println("esitMi = " + esitMi); // s1 s2 ye eşit mi

        System.out.println("s1.equals(s2)= "+s1.equals(s2)); // s1 s2 ye eşit mi
        System.out.println("s2.equals(MERHABA) = " + s2.equals("MERHABA")); // s2 "MERHABA 2 ya eşit mi
    }
}
