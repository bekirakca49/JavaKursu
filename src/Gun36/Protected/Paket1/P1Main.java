package Gun36.Protected.Paket1;
// aynı paketin içindeki erişim düzeylerini gördük
public class P1Main {
    public static void main(String[] args) {
        P1Hayvan h=new P1Hayvan();
        h.ad="karakedi"; // public erişildi.
        h.yas=2; // default erisildi.
        h.cinsi="tekir";// protected erisildi.
        // h.renk private: sadece kendi class ının içinde ulaşılabilir.
    }
}
