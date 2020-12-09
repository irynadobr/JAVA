package lesson5;

public enum ProductType {
    Clothing ("clothing"),
    Products ("products"),
    Shoes ("shoes");


    String type;
    String sex;
    ProductType(String type) {
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "type='" + type + '\'' +
                '}';
    }

}
