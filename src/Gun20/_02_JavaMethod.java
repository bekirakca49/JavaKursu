package Gun20;
// buraya
public class _02_JavaMethod {
    public static void main(String[] args) { // ana kisim burada basliyor
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");

        Math.max(4,5); // daha once yazilmis biz kullaniyoruz
        // ayni bunun gibi bizde metodlar yazabiliriz
        // mesela ekrana merhaba  dunya yazan bir metod yazilir ve surekli cagirilir
        merhabaYaz();
        merhabaYaz();
    } //  ana kisim burada bitiyor
    public static void merhabaYaz(){ // burasi bir fonksiyon
        System.out.println("fonksiyon Merhaba Dunya");
    }
    // metodalr tejrarlayan kodlardan bir kez yazip sonra tekrar cagirmak icin
    // ve buyuk program parcalara bolup kod karsiliginin onune gecmek icin kullanilir
    // temiz kod icin.
}
