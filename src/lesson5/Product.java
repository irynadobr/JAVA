package lesson5;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private ProductType productType;
    private String dateOfManufacture;

    public Product(String name, double price, String productType, String dateOfManufacture) {
    }

    public Product(String name, double price, ProductType productType, String dateOfManufacture) {
        this.name = name;
        this.price = price;
        this.productType = productType;
        this.dateOfManufacture = dateOfManufacture;
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
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                productType == product.productType &&
                Objects.equals(dateOfManufacture, product.dateOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, productType, dateOfManufacture);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productType=" + productType +
                ", dateOfManufacture=" + dateOfManufacture +
                '}';
    }
}

