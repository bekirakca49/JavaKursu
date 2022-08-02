package Gun39._02_Ornek;

public class Dikdortgen extends Sekil {
    private double kisaKenar;
    private double uzunKenar;


    public Dikdortgen(double kisaKenar, double uzunKenar, String name) {
        super(name);
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double getAlan() {
        return kisaKenar*uzunKenar;
    }

    @Override
    public double getCevre() {
        return (kisaKenar+uzunKenar);
    }
}
