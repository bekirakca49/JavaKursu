package Gun12;
public class _08_JavaRandom {
    public static void main(String[] args) {
        // Soru: 0 ile 6 arasında random sayı üreten proğramı yazınız.
        // Math.random() -> 0.0000 - 0.99999 arası sayı üretir.
        double doubleRandomsayi=Math.random();
        System.out.println("doubleRandomsayi = " + doubleRandomsayi);
        int tamSayi=(int) (doubleRandomsayi*5); // 0-5 arası veriyor.
        System.out.println("tamSayi = " + tamSayi);
        // direk yöntem
        System.out.println("Mat = " + (int)Math.random()*5);
    }
}
