package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Product> products = new ArrayList<>();
        products.add(new Product("milk", 18.0, ProductType.Products, "20.11.2020"));
        products.add(new Product("boots", 1500.0,ProductType.Shoes, "25.11.2019"));
        products.add(new Product("dress", 1000.0, ProductType.Clothing, "20.07.2020"));

    }
}
