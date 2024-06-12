package Practice06;

public class Electronics {
    private String brand;
    private double price;

    public Electronics(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
