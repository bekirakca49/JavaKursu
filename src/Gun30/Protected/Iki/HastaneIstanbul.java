package Gun30.Protected.Iki;

import Gun30.Protected.Bir.Doktor;

public class HastaneIstanbul {
    public static void main(String[] args) {
      //  Doktor dok1=new Doktor()Y;
      //  dok1.adi="İsat";
        Doktor dok2=new Doktor("Mehmet"); // default gibi çalışıyor. protecte sadece kendi paketindekiler erişebilir.
        // ama diğer paketlerdeki sadece Constructor ına ulaşılabliir.
    }
}
