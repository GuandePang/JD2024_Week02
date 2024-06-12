package Practice06;

import java.util.List;

public class PriceCalculator {
    public static double priceCalculator(ProductContainer<? extends Object> container){
        List<? extends Object>  products= container.getProducts();
        double totalPrice = 0;
        for(Object product : products){
            if(product instanceof Electronics){
                //ClassCastException
                totalPrice += ((Electronics)products).getPrice();
            } else if (product instanceof Clothing) {
                totalPrice += ((Clothing)products).getPrice();
            }
        }
        return totalPrice;
    }
}
