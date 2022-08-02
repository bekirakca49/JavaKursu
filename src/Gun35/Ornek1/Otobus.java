package Gun35.Ornek1;

public class Otobus extends Arac {
   private int yolcuKapasitesi;

    public Otobus(String renk, int motorHacmi,String marka, int kapiSayisi, int yolcuKapasitesi) {
        super(renk,motorHacmi,marka,kapiSayisi); // miras alınan super class olarak adlandırılır.
        // kendisi subclass yani altClass, yeni evlat.
        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }


    @Override
    public String toString() {
        return "Otobus{" +
                "yolcuKapasitesi=" + yolcuKapasitesi +""+super.toString()+
                '}';
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }
}
