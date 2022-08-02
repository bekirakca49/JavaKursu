package Gun04;

public class _04_Ornek2 {
    public static void main(String[] args) {
        // 1 tane double ve 1 tane short değişken tanımlayınız.
        // değer atayınız sonra double değişkeni short değişkene çevirerek ekrana yazdırınız.
        double a=3.14;
        short b=0;

        System.out.println("b = " + b); // atamadan öncesini gösterecek
        b=(short)a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
