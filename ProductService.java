import java.util.List;
import java.util.ArrayList;
public class ProductService  // Delegation
 {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProductsBelowWarranty(int year) {
        return products.stream()
                .filter(product -> product.getWarranty() < year)
                .toList();
    }

    public List<Product> getProductsByPlace(String place) {
        return products.stream()
                .filter(product -> product.getPlace().equalsIgnoreCase(place))
                .toList();
    }
}
