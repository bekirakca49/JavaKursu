package Gun38._02_Soru;

public class Cat extends Animal implements IAnimal{
    public Cat(String adi) {
        super(adi);
    }

    @Override
    public String  food() {
        return "Cat mama ile beslenmektedir";
    }
}
