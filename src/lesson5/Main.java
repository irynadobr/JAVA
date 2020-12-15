//Створити клас Product (назва, ціна, тип (для цього можете створити енум) і ще 1-3 поля за власним бажанням).
// Приватні поля, гетери-сетери, констркутор, туСтрінг, equals&hashcode.
//        Створити клас Store, який матиме поле - List продуктів. Конструктор класу store не має жодних параметрів,
//        в тілі просто ініціалізує List (new ArrayList<>).
//        В класі Store створити, і в мейні викликати, наступні методи:
//        1. Додати продукт в магазин. Але перш ніж додати його в ліст,
//        здійснити валідацію (чи ціна не від'ємна, чи в назві товару не присутні цифри).
//        2. Видалити продукт з магазину по назві.
//        3. Збільшити ціну для вказаного у параметрі типу продуктів удвічі
//        4. Усі товари, дорожчі вказаної суми, записати у окремий ліст і вивести його на екран
//        (наприклад "В нашому магазині продаються такі преміум товари:...)
//        5. Порахувати загальну суму усіх товарів вказаного у вхідному параметрі типу і вивести її на екран
//        6. Порахувати середню вартість усіх товарів в магазині і вивести це число на екран
//
//        Для роботи з колекцією варто ще створити метод, який наповнить наш магазин одразу же ж певною кількістю продуктів
package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
//        1. Додати продукт в магазин. Але перш ніж додати його в ліст,
//        здійснити валідацію (чи ціна не від'ємна, чи в назві товару не присутні цифри).
        store.addProduct(ProductType.Clothing);
        store.addProduct(ProductType.Products);
        store.addProduct(ProductType.Shoes);
//        2. Видалити продукт з магазину по назві.
        store.removeProduct();
//        3. Збільшити ціну для вказаного у параметрі типу продуктів удвічі
        store.doublingPrice(ProductType.Shoes);
        store.doublingPrice(ProductType.Clothing);
        store.doublingPrice(ProductType.Products);
//        4. Усі товари, дорожчі вказаної суми, записати у окремий ліст і вивести його на екран
//        (наприклад "В нашому магазині продаються такі преміум товари:...)
        store.premiumProduct();
//        5. Порахувати загальну суму усіх товарів вказаного у вхідному параметрі типу і вивести її на екран
        store.sumProductType(ProductType.Products);
        store.sumProductType(ProductType.Clothing);
        store.sumProductType(ProductType.Shoes);
//        6. Порахувати середню вартість усіх товарів в магазині і вивести це число на екран
        store.averageSumProduct();
//        Для роботи з колекцією варто ще створити метод, який наповнить наш магазин одразу же ж певною кількістю продуктів
        store.addCertianAmountProducts(ProductType.Products);
        store.addCertianAmountProducts(ProductType.Clothing);
        store.addCertianAmountProducts(ProductType.Shoes);
//
    }
}
