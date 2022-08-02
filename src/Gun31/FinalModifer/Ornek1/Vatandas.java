package Gun31.FinalModifer.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo;
    static int tcNoSayac=1001; // bir tanesin ve değiştirilemez. sadece bir kez veri atama şansı var.

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo =++tcNoSayac;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
