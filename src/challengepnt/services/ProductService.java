package challengepnt.services;

import challengepnt.entities.Bebida;
import challengepnt.entities.Fruta;
import challengepnt.entities.Higiene;
import challengepnt.entities.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class ProductService {
    
    public void getMaxPriceAndMinPrice(List<Producto> productList) {
        String minName = "", maxName = "";
        Producto oldProduct = productList.get(0);
        for (int i = 1; i < productList.size(); i++) {
            Producto product = productList.get(i);
            if (oldProduct.compareTo(product) == 1) {
                minName = product.getNombre();
            }
            if (oldProduct.compareTo(product) == -1) {
                maxName = product.getNombre();
            }
            
            oldProduct = product;
        }
        
        System.out.println("Producto mas caro: " + maxName);
        System.out.println("Producto mas barato: " + minName);
        
    }
    
    public void showProducts(List<Producto> productList) {
        for (Producto product : productList) {
            
            System.out.println(product.toString());
        }
        System.out.println("========================");
    }
    
    public List<Producto> loadProducts() {
        List<Producto> productList = new ArrayList();
        productList.add(new Bebida("Coca-Cola Zero", 1.5, 20d));
        productList.add(new Bebida("Coca-Cola", 1.5, 18d));
        productList.add(new Higiene("Shampoo Sedal", 500, 19d));
        productList.add(new Fruta("Frutillas", "kilo", 64d));
        return productList;
    }
}
