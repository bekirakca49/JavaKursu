package Gun34._03_Ornek;

public class GenelMudur extends Calisan {
    private double tazminat;

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    public GenelMudur(String isim, double maas, int maasKatSayisi, double tazminat) {
        super(isim, maas, maasKatSayisi);
        this.tazminat=tazminat;
    }
    public double maasHesapla(){
        return super.maasHesapla()+tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "tazminat=" + tazminat +" Maas= "+super.maasHesapla()+
                '}';
    }
}
