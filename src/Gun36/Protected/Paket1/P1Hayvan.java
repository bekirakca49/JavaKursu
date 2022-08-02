package Gun36.Protected.Paket1;
// aynı paketin içindeki erişim düzeylerini gördük.
public class P1Hayvan {
    public String ad;
    int yas; // default. yalnızca kendi paketinden erişilebilir.
   protected String cinsi; // default ile aynı ek bir özelliği var onu bugün göreceğiz.
   private String renk; // sadece kendi class ından ulaşılabilir.
}
