package Gun40._01_Ornek;
public abstract class Hayvan {
    private int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    private static int sayac=0;

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setId();
        setIsim(isim);
        setDogumTarihi(dogumTarihi);
        setVahsi(vahsi);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id =++sayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {

        System.out.print("Yiyeceği: "); yiyecegi();
        System.out.print("Yemek miktarı: ");yemekMiktari();
        System.out.print("uyku süresi: ");gunlukUykuSuresi();
        System.out.print("Sesi: ");sesi();
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}
