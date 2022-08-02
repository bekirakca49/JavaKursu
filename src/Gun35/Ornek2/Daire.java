package Gun35.Ornek2;

public class Daire extends Sekil {
    private int yariCap;

    public Daire(int yariCap) {
        this.yariCap = yariCap;
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }
    public double getAlan(){
        return Math.PI*this.yariCap*this.yariCap;
    }
    public double getCevre(){
        return Math.PI*this.yariCap;
    }
}
