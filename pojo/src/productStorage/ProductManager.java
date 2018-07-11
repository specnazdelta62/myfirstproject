package productStorage;

import java.util.ArrayList;

public class ProductManager {

    static ArrayList<Product> productsList = new ArrayList<>();


    public void add(Product product){
        productsList.add(product);
        System.out.println("Продукт " + product.getName() + " добавлен в список");
    }

    public void remove(Product product){
        productsList.remove(product);
        System.out.println("Продукт " + product.getName() + " удален");
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
