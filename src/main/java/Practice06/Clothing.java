package Practice06;

public class Clothing {
    private String size;
    private double price;

    public Clothing(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
