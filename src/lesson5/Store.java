package lesson5;

import java.util.*;

public class Store {
    private List<Product> products = new ArrayList<>();

    public Store() {
    }

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(products, store.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Store{" +
                "products=" + products +
                '}';
    }


    public void addProduct(Product product) {
        if (product.getPrice() > 0 && !product.getName().matches(".*\\d.*")) {
            products.add(product);
        }
    }


    public void removeProduct(String productName) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(productName)) {
                iterator.remove();
                System.out.println("Product, " + product.getName() + ", was deleted!");
            }
        }

    }


    public void doublingPrice(ProductType productType) {

        for (Product product : products) {
            if (product.getProductType().equals(productType)) {
                product.setPrice(product.getPrice() * 2.0);
            }
        }
        System.out.println(products);
    }

    public List<Product> premiumProduct(double priceValue) {
        List<Product> premiumProduct = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > priceValue) {
                premiumProduct.add(product);

            }
        }
        return premiumProduct;
    }

    public void sumProductType(ProductType productType) {

        double sumProductType = 0;
        for (Product product : products) {
            if (product.getProductType().equals(productType)) {
                sumProductType = sumProductType + product.getPrice();

            }

        }
        System.out.println("загальна сума товарів " + sumProductType);
    }

    public void averageSumProduct() {
        double averageSumProduct = 0;
        for (Product product : products) {
            averageSumProduct = averageSumProduct + product.getPrice();

        }
        averageSumProduct = averageSumProduct / products.size();
        System.out.println("Середня вартість усіх товарів в магазині: " + averageSumProduct);
    }


}
