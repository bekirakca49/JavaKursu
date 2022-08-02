package Gun35.Ornek1;
public class Arac {
    private String renk;
    private int motorHacmi;
    private String marka; private int kapiSayisi;

    public Arac(String renk, int motorHacmi, String marka, int kapiSayisi) {
        setRenk(renk); setMotorHacmi(motorHacmi);setMarka(marka);setKapiSayisi(kapiSayisi);
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }
    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi<=5 && kapiSayisi>0)
        this.kapiSayisi = kapiSayisi;
        else {
            System.out.println("Kapıs sayısı 5 den fazla olamaz");
            kapiSayisi=0;
        }
    }
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", marka='" + marka + '\'' +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
