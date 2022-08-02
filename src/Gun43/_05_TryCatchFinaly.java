package Gun43;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {
        long startTime=0;

        String str="";
        try {
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki nokta");
            char ilkHarf=str.charAt(0);
            System.out.println("hatadan sonraki nokta");
        }
        catch (Exception hata){
            System.out.println("Catch bloğu çalıştı, hata var");
            // hata.printStackTrace(); bu direk hatayı ekrana yazıyor.
        }
        finally { // try-catch in finali
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
            // hata olsun veya olmasın çalışcak final bölümü her zaman çalışır
            // kullanım sebebi: try catch in içinde yapılmış
            // işlemlerde arta kalan kapama gibi bu bölüme ait işlmeler
            // yapılarak kod düzeni sağlanmış olur.
        }
        System.out.println("try-atch bloğundan sonra çalışan kısım"); // hata olsa da olmasada çalışır
    }
}
