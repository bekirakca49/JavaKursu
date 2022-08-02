package Gun33._02_Encapsulation;

public class Araba {
    private String rengi;
    private String model;
    private int motorHacmi;
    private int kapiSayisi;

    public Araba() {
    }

    public Araba(String rengi, String model, int motorHacmi, int kapiSayisi) {
        setRengi(rengi);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayisi(kapiSayisi);
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        if (kapiSayisi<5)
            this.kapiSayisi=kapiSayisi;
        else
            System.out.println("fabrikamızda böyle bir üretim bulunmamaktadır. ");
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "rengi='" + rengi + '\'' +
                ", model='" + model + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
