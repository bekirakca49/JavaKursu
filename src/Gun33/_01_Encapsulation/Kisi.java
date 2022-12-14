package Gun33._01_Encapsulation;

public class Kisi {
    String ad;
    String soyad;
   private int yas;

    public Kisi() {
    }
// değişkene direk erişimi kapatıp
    // bir metod ile korumalı veri gönderme ve alma işlemine Encapsulation denir.
    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        yasAta(yas);
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
    public void yasAta(int yas){
        this.yas= Math.abs(yas);
    }
    public int yasGetir(){
        return yas;
    }
}
