package productStorage;


public class Product {

    private String type;
    private String name;
    private double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }


    Product(){
        type = "";
        name = "";
        price = 0.0;
        System.out.println(Продукт создан!);
    }

    Product(type, name, price){
        this.type = type;
        this.name = name;
        this.price = price;
        System.out.println(Продукт создан!);
    }
}
