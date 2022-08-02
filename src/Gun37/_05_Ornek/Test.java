package Gun37._05_Ornek;

public class Test implements IGosterir,IYazdirir{

    @Override
    public void goster() {
        System.out.println("gster");
    }
    @Override
    public void yaz(String mesaj) {
        System.out.println("mesaj=  "+mesaj);
    }
    @Override
    public void yaz() {
        System.out.println("yaz");
    }
}
