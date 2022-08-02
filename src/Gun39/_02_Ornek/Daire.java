package Gun39._02_Ornek;

public class Daire extends Sekil {
    private double yaricap;

    public Daire(String name, double yaricap) {
        super(name);
        setYaricap(yaricap);
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }
    @Override
    public double getAlan() {
        return Math.PI*yaricap*yaricap;
    }
    @Override
    public double getCevre() {
        return 2*Math.PI*yaricap;
    }
}
