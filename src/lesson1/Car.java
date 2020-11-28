package lesson1;
//5.
//        Створити клас Car
//                - кінські сили (або потужність)
//                - об'єм двигуна
//                + 5 полів придумати самостійно


public class Car {
    private int power;
    private double engineModel;
    private String model;
    private int year;
    private String color;
    private double price;
    private String driver;

    public Car() {
    }


    public Car(int power, double engineModel, String model, int year, String color, double price, String driver) {
        this.power = power;
        this.engineModel = engineModel;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.driver = driver;
    }

    public int getPower() {
        return power;
    }

    public double getEngineModel() {
        return engineModel;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getDriver() {
        return driver;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setEngineModel(double engineModel) {
        this.engineModel = engineModel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", engineModel=" + engineModel +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", driver='" + driver + '\'' +
                '}';
    }
}



