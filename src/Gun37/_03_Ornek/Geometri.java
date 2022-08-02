package Gun37._03_Ornek;

public class Geometri {
    public static void main(String[] args) {
        // bir interface in birden class tarafından implemente edilmesi

        Cember c=new Cember(); // bu şekilde bütün metodlara erişim var.
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

        // interface lerden nesne üretileme fakat referans tipi oluşturulablir. bu bize Polymorphism sağladı.
        ICizdirir c2=new Cember(); // direk olarak sadece Interface de ismi verilmiş olanlara ulaşılabilir. Bu bizi kısıtlar.
        // bütün metodlara ulaşılamıyor. Nerden geldiğini belli etmek için kullanılıyor aslında.
        c2.ciz();

    }
}
