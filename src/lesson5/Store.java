package lesson5;

import java.util.List;
import java.util.Objects;

public class Store {
    private List <Product> products;

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

public void addProduct () {

}

public void removeProduct () {

}
public void doublingPrice () {

}
public void premiumProduct () {

}public void sumProductType () {

    }

    public void averageSumProduct () {


    }

}
