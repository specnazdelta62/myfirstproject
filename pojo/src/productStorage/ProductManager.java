package productStorage;

import java.util.ArrayList;

public class ProductManager {

    static ArrayList<Product> productsList = new ArrayList<>();
    Product product;

    public void add(Product product){
        productsList.add(product);
        System.out.println("Продукт " + product.getName() + " добавлен в список");
    }

    public void remove(String name){
        for (int i = 0; i < productsList.size(); i++)
            if (name.equals(product.getName())) {
                productsList.remove(i);
                break;
            }
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
