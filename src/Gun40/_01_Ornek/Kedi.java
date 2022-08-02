package Gun40._01_Ornek;

public class Kedi extends Hayvan{
    @Override
    public void yiyecegi() {
        System.out.println("Mama ve balık");
    }
    @Override
    public void yemekMiktari() {
        System.out.println("Günlük iki öğün beslenir");
    }
    @Override
    public void gunlukUykuSuresi() {
        System.out.println("Günlük 10 saat uyurlar");

    }

    @Override
    public void sesi() {
        System.out.println("Kediler miyavlar");

    }

    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId() {
        super.setId();
    }

    @Override
    public String getIsim() {
        return super.getIsim();
    }

    @Override
    public void setIsim(String isim) {
        super.setIsim(isim);
    }

    @Override
    public boolean isVahsi() {
        return super.isVahsi();
    }

    @Override
    public void setVahsi(boolean vahsi) {
        super.setVahsi(vahsi);
    }

    @Override
    public String getDogumTarihi() {
        return super.getDogumTarihi();
    }

    @Override
    public void setDogumTarihi(String dogumTarihi) {
        super.setDogumTarihi(dogumTarihi);
    }
    @Override
    public String toString() {
        System.out.println(getClass().getSimpleName());
        System.out.println("---------------------------" );
        return super.toString();
    }
}
