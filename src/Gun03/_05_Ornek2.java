package Gun03;

public class _05_Ornek2 {
    public static void main(String[] args) {
        // Örnek Soru: yarıçapı(r) verilen bir dairenin çevresini ve alanını bulunuz
        // alan=pi*r*r çevre=2*pi*r  pi=3.14

        float pi=3.14F;
        int r=12;
        float alan=pi*r*r;
        float cevre=2*pi*r;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

    }
}
