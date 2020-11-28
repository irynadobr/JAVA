package lesson1;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {

//        1. Створити 10 цілочисленних змінних
        int a1 = 10000000;
        int a2 = 5;
        int a3 = 2;
        int a4 = 3;
        int a5 = 7;
        int a6 = 4;
        int a7 = 6;
        int a8 = 9;
        int a9 = 1;
        int a10 = 8;

//         додати їх між собою

        int rezultat1 = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;
//                - відняти їх між собою
        int rezultat2 = a1 - a2 - a3 - 4 - a5 - a6 - a7 - a8 - a9 - a10;
//                - перемножити їх між собою
        int rezultat3 = a1 * a2 * a3 * a4 * a5 * a6 * a7 * a8 * a9 * a10;
//                - поділити їх між собою
        int rezultat4 = a1 / a2 / a3 / a4 / a5 / a6 / a7 / a8 / a9 / a10;
//        Вивести результати в консоль
        System.out.println(rezultat1 + "  " + rezultat2 + "  " + rezultat3 + "  " + rezultat4);
//
//        2. Придумати речення з 10-12 слів. Кожне слово покласти в змінну. Вивести в консоль
//        ціле речення.


        String skil1 = "курси";
        String skil2 = "з";
        String skil3 = "програмування";
        String skil4 = "OktenWeb -";
        String skil5 = "найкращі";
        String skil6 = "з";
        String skil7 = "усіх";
        String skil8 = "курсів";
        String skil9 = "у";
        String skil10 = "Львові";
        String skil = "";
        String[] skils = new String[]{skil1, skil2, skil3, skil4, skil5, skil6, skil7, skil8, skil9, skil10};
        for (int i = 0; i < skils.length; i++) {
            skil = skil + skils[i] + " ";
        }
        System.out.println(skil);

//        3.Свторити клас User з полями
//        int id,
//        int age
//        String name,
//        String surname,
//        double weight,
//        double height.


//        Створити 10 об'єктів класу User.

        User user1 = new User(1, 10, "Olga", "Ivanova", 30.50, 1.50);
        User user2 = new User(2, 12, "Nina", "Petrova", 35.50, 1.50);
        User user3 = new User(3, 15, "Oleg", "Kim", 40.00, 1.60);
        User user4 = new User(4, 20, "Kira", "Nesterova", 48.00, 1.65);
        User user5 = new User(5, 21, "Natali", "Xlopik", 49.00, 1.70);
        User user6 = new User(6, 25, "Igor", "Isaiv", 58.00, 1.80);
        User user7 = new User(7, 28, "Pavel", "Kostiv", 65.00, 1.75);
        User user8 = new User(8, 31, "Dima", "Kravec", 69.00, 1.85);
        User user9 = new User(9, 35, "Nazar", "Karas", 70.00, 1.90);
        User user10 = new User(10, 40, "Slavik", "Ignatov", 67.00, 1.95);

//        Скласти між собою значення їх віку і вивести в консоль.
//        Скласти між собою значення їх ваги і вивести в консоль.
//        Скласти між собою значення їх зросту і вивести в консоль.
        int sumAge = user1.getAge() + user2.getAge() + user3.getAge() + user4.getAge() + user5.getAge() + user6.getAge() + user7.getAge() + user8.getAge() + user9.getAge() + user10.getAge();
        System.out.println("sumAge = " + sumAge);
        double sumWeight = user1.getWeight() + user2.getWeight() + user3.getWeight() + user4.getWeight() + user5.getWeight() + user6.getWeight() + user7.getWeight() + user8.getWeight() + user9.getWeight() + user10.getWeight();
        System.out.println("sumWeight = " + sumWeight);
        double sumHeight = user1.getHeight() + user2.getHeight() + user3.getHeight() + user4.getHeight() + user5.getHeight() + user6.getHeight() + user7.getHeight() + user8.getHeight() + user9.getHeight() + user10.getHeight();
        System.out.println("sumHeight = " + sumHeight);

//        4. Зробити завдання 3, але 10 об'єктів покласти водин масив.
//        Скласти між собою значення їх віку і вивести в консоль.
//        Скласти між собою значення їх ваги і вивести в консоль.
//        Скласти між собою значення їх зросту і вивести в консоль.

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        sumAge = 0;
        sumWeight = 0.00;
        sumHeight = 0.00;
        for (User user : users) {
            sumAge = sumAge + user.getAge();
            sumWeight = sumWeight + user.getWeight();
            sumHeight = sumHeight + user.getHeight();
        }
        System.out.println("sumAge = " + sumAge + "  sumWeight = " + sumWeight + "  sumHeight = " + sumHeight);


//        5.
//        Створити клас Car
//                - кінські сили (або потужність)
//                - об'єм двигуна
//                + 5 полів придумати самостійно


//        Створити 10 об'єктів класу Car.
        Car car1 = new Car(245, 2.993, "BMW X5", 2000, "white", 10000, "Igor");
        Car car2 = new Car(300, 200, "OPEL", 1995, "black", 6000, "Olga");
        Car car3 = new Car(160, 1.798, "AUDI", 2001, "blue", 5000, "Ivan");
        Car car4 = new Car(143, 1.998, "MAZDA", 2005, "silver", 4500, "Oleg");
        Car car5 = new Car(283, 2.96, "NISSAN 300ZX", 2010, "black", 3500, "Nazar");
        Car car6 = new Car(64, 1.29, "VAZ 2107", 1997, "yellow", 500, "Ivanna");
        Car car7 = new Car(128, 1.5, "HONDA CR-V", 2005, "red", 6000, "Natali");
        Car car8 = new Car(125, 2.99, "TOYOTA LAND", 2011, "black", 9500, "Ostap");
        Car car9 = new Car(68, 1.896, "SKODA OKTAVIA", 2002, "silver", 7500, "Inna");
        Car car10 = new Car(86, 1.5, "DAEWOO LANOS", 2003, "white", 8000, "Karina");

//        Скласти між собою значення їх об'ємів і вивести в консоль.
        int sumPower = car1.getPower() + car2.getPower() + car3.getPower() + car4.getPower() + car5.getPower() + car6.getPower() + car7.getPower() + car8.getPower() + car9.getPower() + car10.getPower();
        System.out.println("sumPower = " + sumPower);

//        Скласти між собою значення їх потужностей і вивести в консоль.
        double sumEngineModel = car1.getEngineModel() + car2.getEngineModel() + car3.getEngineModel() + car4.getEngineModel() + car5.getEngineModel() + car6.getEngineModel() + car7.getEngineModel() + car8.getEngineModel() + car9.getEngineModel() + car10.getEngineModel();
        System.out.println("sumEngineModel = " + sumEngineModel);

//        6.
//        Зробити завдання 5 , але 10 об'єктів покласти в масив.
//        Скласти між собою значення їх об'ємів і вивести в консоль.
//        Скласти між собою значення їх потужностей і вивести в консоль.

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        sumPower = 0;
        sumEngineModel = 0;
        for (Car car : cars) {
            sumPower = sumPower + car.getPower();
            sumEngineModel = sumEngineModel + car.getEngineModel();
        }
        System.out.println("sumPower = " + sumPower + "   sumEngineModel = " + sumEngineModel);


//        7. За допомоги %, спробувати "реверснути" трьохзначне число. Приклад 412 => 214

        String number1 = "4";
        String number2 = "1";
        String number3 = "2";

        int x1 = Integer.parseInt((number1 + number2 + number3).trim()) % 10;
        int x2 = Integer.parseInt((number1 + number2).trim()) % 10;
        int x3 = Integer.parseInt((number1).trim()) % 10;

        System.out.print(x1);
        System.out.print(x2);
        System.out.print(x3);


    }
}
