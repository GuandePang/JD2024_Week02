package Practice06;

public class Main {
    public static void main(String[] args) {
        ProductContainer<Object> container = new ProductContainer<>();

        container.addProducts(new Clothing("S", 20.1));
        container.addProducts(new Clothing("L", 35.5));
        container.addProducts(new Electronics("Huawei", 1999.9));

        double price = PriceCalculator.priceCalculator(container);
        System.out.println("Total Price: " + price);
    }
}
