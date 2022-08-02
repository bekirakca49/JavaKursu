package Gun31.FinalModifer.Ornek2;

public class Sabitler {
    final static int birGundekiSaatSayisi=24;
    final static int birSaatdekiDakSayisi=60;
    final static int birDakikadakiSaniyeSayisi=60;

    public static int hesapla(int gun, int saat, int dak){
        int toplamSaniye=
                gun*Sabitler.birGundekiSaatSayisi*Sabitler.birDakikadakiSaniyeSayisi*Sabitler.birSaatdekiDakSayisi+
                        saat*Sabitler.birSaatdekiDakSayisi*Sabitler.birDakikadakiSaniyeSayisi+
                        dak*Sabitler.birDakikadakiSaniyeSayisi;
        return toplamSaniye;
    }
}
