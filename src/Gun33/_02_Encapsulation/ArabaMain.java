package Gun33._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        araba1.setRengi("Kirmizi");
        araba1.setModel("sedan");
        araba1.setMotorHacmi(1800);
        araba1.setKapiSayisi(4);

        System.out.println("araba1 = " + araba1);

        Araba araba2=new Araba("","",1800 ,4);
        System.out.println("araba2 = " + araba2);
        System.out.println("araba1.getModel() = " + araba1.getModel());
    }
    // KURAL: genel yazılım kuralıdır.
    // bütün değişkenler private yapılır.
    // yani kapsulleme ile kullanılır.
    // Eğer gerekiyorsa private kaldırılır.
}
