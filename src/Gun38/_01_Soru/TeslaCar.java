package Gun38._01_Soru;

public class TeslaCar extends Vehicle implements IElektric {
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya 50 yıl gidir";
    }

    @Override
    public String drive() {
        return "Auto pilot sürüş özelliği vardır";
    }
}
