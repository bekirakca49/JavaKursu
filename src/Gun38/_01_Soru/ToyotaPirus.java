package Gun38._01_Soru;

public class ToyotaPirus extends Vehicle implements IElektric,IGas{
    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }
    @Override
    public String changeBattery() {
        return "ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return "ilk 10 km elektrikle gider";
    }
}
