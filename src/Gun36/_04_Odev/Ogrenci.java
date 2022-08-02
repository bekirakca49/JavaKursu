package Gun36._04_Odev;
public class Ogrenci extends Kisi {
    private double ucret;

    public Ogrenci(String ad, String adres, String okul, String uyeTipi, double ucret) {
        super(ad, adres, okul, uyeTipi);
        this.ucret = ucret;
    }
}
