package productStorage;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ProductManager {

    private ArrayList<Product> productsList;

    public ArrayList<Product> getProductsList() {
        if (productsList == null) return new ArrayList<Product>();
        return productsList;
    }

    public void add(Product product){
        productsList.add(product);
        System.out.println("Продукт " + product.getName() + " добавлен в список");
    }

    public void remove(String name){
        Predicate<Product> p = product -> product.getName().equals(name);
        productsList.removeIf(p);
    }

    public ArrayList getAll(){
        System.out.println("Спискок отправлен");
        return productsList;
    }

    public void removeAll(){
        productsList.clear();
        System.out.println("Список очищен");
    }
}
