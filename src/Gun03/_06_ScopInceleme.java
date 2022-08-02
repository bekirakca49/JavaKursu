package Gun03;

public class _06_ScopInceleme {
    public static void main(String[] args) {
        int a=5;  // a degeri aşağıdaki parantez bölgesinde geçerli olur
                    // çünkü dışardaki içeriye erişeilir.

        { // bu parantez arası kendine özel bölge oluşturur ve buradaki tanımlama değişkenler
            // sadece burada geçerli olur. Kullanım amacı karşıklığı azaltmak.
            // b nin değerini dışarda kullanamıyoruz.
            int b=5;
            b=77;
            a=b; // dışarda olan bir değer burda kullanılabilir.
            System.out.println("b = " + b);
        } // içerde tanımlanan  değişkenler sadece içeride kullanılabilir.
        // b değişkenine sadece özel bölgede erişilebilir.  Bu işleme Scop denilmektedir.
        System.out.println("a = " + a);
    }
}
