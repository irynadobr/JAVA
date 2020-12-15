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

    public String scannerString(String enter) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  " + enter + ":  ");
        String sk = scanner.next();
        return sk;
    }

    public double scannerDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price: ");
        double sk = scanner.nextDouble();
        return sk;
    }

    public int scannerInt() {
        Scanner scanner = new Scanner(System.in);
        int sk = scanner.nextInt();
        return sk;

    }


//    public void addProduct(ProductType productType) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Додати в магазин product type - " + productType.type + " :  ");
//        System.out.print("Enter name: ");
//        String newName = scanner.next();
//        System.out.print("Enter price: ");
//        double newPrice = scanner.nextDouble();
//        System.out.print("Enter date of manufacture: ");
//        String newDateOfManufacture = scanner.next();
//
//        Product newProduct = new Product(newName, newPrice, productType, newDateOfManufacture);
//
//        if (newProduct.getPrice() > 0 && !newProduct.getName().matches(".*\\d.*")) {
//            products.add(newProduct);
//        }
//        System.out.println(products);
//
//    }

    public void addProduct(ProductType productType) {
        System.out.println("Додати в магазин product type - " + productType.type + " :  ");
        Product newProduct = new Product(scannerString("name"), scannerDouble(), productType, scannerString("date of manufacture: "));
        if (newProduct.getPrice() > 0 && !newProduct.getName().matches(".*\\d.*")) {
            products.add(newProduct);
        }
        System.out.println(products);

    }


    public void removeProduct() {

        System.out.println("Remove the product from the store by name: ");
        Iterator<Product> iterator = products.iterator();
        String name = scannerString("name");
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                iterator.remove();
                System.out.println("Product - " + product.getName() + ", видалено");
            }
        }
        System.out.println(products);
    }

    public void doublingPrice(ProductType productType) {
        List<Product> newProduct = new ArrayList<>();
        for (Product product : products) {
            if (product.getProductType().equals(productType)) {
                product.setPrice(product.getPrice() * 2.0);
                newProduct.add(product);
            }
        }
        if (newProduct.isEmpty()) {
            System.out.println("В магазині немає продутків типу - " + productType.type);
        } else {
            System.out.println("Збільшено удвічі ціну для продуктів типу - " + productType.type + " :  ");
            System.out.println(products);
        }
    }

    public void premiumProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Преміум продукти, які дорощі вказаної суми: ");
        System.out.print("Enter priceValue: ");
        double priceValue = scanner.nextInt();
        List<Product> premiumProduct = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > priceValue) {
                premiumProduct.add(product);
            }
        }
        if (premiumProduct.isEmpty()) {

            System.out.println("В магазині немає преміум товарів");
            return;
        }
        System.out.println("у нашому магазині продаються такі преміум товари:  " + premiumProduct);
    }

    public void sumProductType(ProductType productType) {

        double sumProductType = 0;
        for (Product product : products) {
            if (product.getProductType().equals(productType)) {
                sumProductType += product.getPrice();
            }

        }
        if (sumProductType == 0) {

            System.out.println("В магазині немає продуктів типу - " + productType.type);
        } else {
            System.out.println("Загальна сума продуктів типу - " + productType.type + " :  " + sumProductType);
        }
    }

    public void averageSumProduct() {
        double averageSumProduct = 0;
        for (Product product : products) {
            averageSumProduct += product.getPrice();
        }
        averageSumProduct = averageSumProduct / products.size();
        System.out.println("Середня вартість усіх товарів в магазині: " + averageSumProduct);
    }

    public void addCertianAmountProducts(ProductType productType) {
        System.out.println("Додати продукти типу - " + productType.type + " у кількості: ");
        System.out.print("Enter number: ");
        int number = scannerInt();
        for (int i = 1; i <= number; i++) {
            addProduct(productType);
        }

    }

}
