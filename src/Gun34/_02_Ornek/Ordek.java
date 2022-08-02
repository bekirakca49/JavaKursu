package Gun34._02_Ornek;

public class Ordek extends Hayvan{ // baba, babanın herşeyin miras aldı.3.dükkan
    int kanatAcikligi;
    public Ordek(String renk,int kilo, String cinsi,int kanatAcikligi){
        super(renk,kilo,cinsi); // super ust Class ı gösterir. Yani Hayvan ı gösteriyor.
        this.kanatAcikligi=kanatAcikligi;
    }
    public void konustu(){
        super.konustu(); // al aynen kullan
        System.out.println("vak vak dedi"); // istersen bir şey daha ekle
    }

    @Override
    public String toString() {
        return "Ordek{" +
                "kanatAcikligi=" + kanatAcikligi +super.toString()+
                '}';
    }
}
