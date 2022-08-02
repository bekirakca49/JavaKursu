package Gun32._03_Ornek;

public class Pizza {
    double price;
    PizzaSize size;

    public Pizza(PizzaSize size, double price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                ", size=" + size +
                '}';
    }
    // TODO : Her pizza tipi için ücret belirleyerek toplam ücreti yazdırınz.
}
