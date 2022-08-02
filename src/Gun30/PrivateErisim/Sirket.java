package Gun30.PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1 =new Calisan();
        cal1.id=1;
        cal1.name="Halil";
        cal1.surName="Fındık";
        //cal1.password="1234";
        // burası private olduğundan direk erişilemez.

        cal1.sifreAta("Merhaba123+");
        cal1.sifreGoster();

    }
}
