package Gun09;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {
        int sayac=0;
        sayac=sayac+1; // sayacin değerini 1 atrırır. sonuc sayac=1
        sayac++;  // sayac++ da değerini 1 artırır. sayac=2 oldu
        ++sayac; // ++sayac da değerini 1 artırır. sayac=3 oldu
        sayac=sayac-1; // sayacın değerini 1 azaltır sayac=2
        sayac--; // sayacın değererini 1 azaltır  sayac=1
        --sayac; // sayacın değerini 1 azaltır sayac=0 oldu
        // genel olarak proğramlarda sayac yerine i kullanılır.

        int sonuc=0;
        sonuc=sayac++;  // önce işlem yapılır, sonra sayacın değeri 1 artırılır
                        // bu duruma göre sonuc=sayac  sayac=sayac+1 oluyor.
                        // sonuc=0, sayac=1 olur.

        sayac=0;
        sonuc=++sayac;  // önce artırma işlemi yapılır, sonra diğer işleme geçildi
                        // sayac=sayac+1; sonuc=sayac;
                        // sayac=1, sonuc=1
    }
}
