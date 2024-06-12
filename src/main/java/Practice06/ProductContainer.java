package Practice06;

import java.util.ArrayList;
import java.util.List;

public class ProductContainer<T> {
    private List<T> products = new ArrayList<>();

    public void addProducts(T product){
        products.add(product);
    }

    public List<T> getProducts(){
        return products;
    }
}
