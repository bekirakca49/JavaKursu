package Gun36._04_Odev;

public class Calisan extends Kisi {
    private double maas;

    public Calisan(double maas) {
        this.maas = maas;
    }

    public Calisan(String ad, String adres, String okul, String uyeTipi, double maas) {
        super(ad, adres, okul, uyeTipi);
        this.maas = maas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
}
