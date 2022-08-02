package Gun43;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        String str="";
        int a=5;
        int b=0;
        int c=0;
        //Catch bloklarında hangi hata önce geliyorsa ona uygun hata adı yazılır, genel Exception en sona yazılır.
        try {
            System.out.println("1. Adım");
            char ilkHarf=str.charAt(0); // hata olduğu anda devamı çalışmaz uygun catch e gider.
            System.out.println("2.Adım");
            c=a/b;
            System.out.println("3.Adım");
        }
        catch (StringIndexOutOfBoundsException hata){ // burada özel hata ismi yızılırsa;
            // ilgili hata gelirse catch kısmı çalışır.
            System.out.println("Kelime boş olduğu için harf alınamadı");
        }
        catch (ArithmeticException hata){
            System.out.println("Sayı sıfıra bölünemez");
        }
        catch (Exception hata){ // hangi hata olursa olsun hata olduğunda Exception catch çalışır.
            System.out.println(hata.getMessage());
        }
    }
}
