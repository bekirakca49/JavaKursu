package Gun38._01_Soru;

public class Bus extends Vehicle implements IDeisel{

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Bir depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "Şiher içine girme, ve yavaş sür, yolcuları rahatsız etme";
    }
}
