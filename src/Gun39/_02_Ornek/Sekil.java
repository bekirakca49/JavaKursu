package Gun39._02_Ornek;

public abstract class Sekil {
    private String name;

    public Sekil(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name=name;
    }

    public abstract double getAlan();
    public abstract double getCevre();

    public void ciz(){
        System.out.println(this.name + "isimli şekil çizildi");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan='" + Math.round(getAlan()) + '\'' +
                "çevre='" + Math.round(getCevre()) + '\'' +
                '}';
    }
}
