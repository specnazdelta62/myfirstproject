package productStorage;

import java.util.ArrayList;

public class ProductManager {

    static ArrayList<Product> productsList = new ArrayList<Product>();


    public void add(Product product){
        productsList.add(product);
        System.out.println("Продукт " + product.getName() + " добавлен в список");
    }

    public void remove(String name){

    }

    public void getAll(){

    }

    public void removeAll(){

    }
}
