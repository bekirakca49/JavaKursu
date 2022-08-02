package Gun36._04_Odev;

public class Kisi {
    private String ad;
    private String adres;
    private String okul;
    private String uyeTipi;

    public Kisi() {
    }
    public Kisi(String ad, String adres, String okul, String uyeTipi) {
        setAd(ad);
        setAdres(adres);
        setOkul(okul);
        setUyeTipi(uyeTipi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getOkul() {
        return okul;
    }

    public void setOkul(String okul) {
        this.okul = okul;
    }

    public String getUyeTipi() {
        return uyeTipi;
    }

    public void setUyeTipi(String uyeTipi) {
        this.uyeTipi = uyeTipi;
    }
}
