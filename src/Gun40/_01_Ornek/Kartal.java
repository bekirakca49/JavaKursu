package Gun40._01_Ornek;

public class Kartal extends Hayvan {
    @Override
    public void yiyecegi() {
        System.out.println("Et");

    }

    @Override
    public void yemekMiktari() {
        System.out.println("Günde 1 kg");

    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("8 saat");

    }

    @Override
    public void sesi() {
        System.out.println("Ciyak, fiyuuu");

    }

    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
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
