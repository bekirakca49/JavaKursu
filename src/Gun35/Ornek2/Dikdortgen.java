package Gun35.Ornek2;

public class Dikdortgen extends Sekil{
    private int uzunluk;
    private int genislik;

    public Dikdortgen(int uzunluk, int genislik) {
        setGenislik(genislik);
        setUzunluk(uzunluk);
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "genislik=" + genislik +
                ", uzunluk=" + uzunluk +
                '}';
    }
    public double getAlan(){
        return uzunluk*genislik;
    }
    public double getCevre(){
        return (uzunluk+genislik)*2;
    }
}
