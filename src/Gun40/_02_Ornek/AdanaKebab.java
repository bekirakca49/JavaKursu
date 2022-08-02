package Gun40._02_Ornek;

public class AdanaKebab implements Food{

    public AdanaKebab() {
    }
    void grill(){}
    void marinade() {}
    @Override
    public void taste() {
        System.out.println("Adananın en özel lezzi");
    }
    public String toString() {
        return super.toString();
    }
    @Override
    public double ucret() {
        return 55;
    }
}
