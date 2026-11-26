public class Homework2_3 {

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16", "15.09.2024", "Apple", "USA", 4999, false);
        productsArray[2] = new Product("Xiaomi 14", "10.11.2023", "Xiaomi", "China", 3499, true);
        productsArray[3] = new Product("Google Pixel 9", "20.08.2024", "Google", "USA", 4599, false);
        productsArray[4] = new Product("Sony Xperia 1 VI", "05.05.2024", "Sony", "Japan", 5299, true);

        System.out.println("--- Список товаров ---");
        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
        }

        System.out.println("\n--- Парк аттракционов ---");
        Park park = new Park();
        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "11:00 - 20:00", 800);

        attraction1.printInfo();
        attraction2.printInfo();
    }
}

class Product {
    String name;
    String manufactureDate;
    String manufacturer;
    String country;
    double price;
    boolean isBooked;

    public Product(String name, String manufactureDate, String manufacturer, String country, double price, boolean isBooked) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void printInfo() {
        System.out.println("Товар: " + name + " | Дата: " + manufactureDate + " | Производитель: " + manufacturer + " | Страна: " + country + " | Цена: " + price + " | Забронирован: " + isBooked);
    }
}

class Park {
    class Attraction {
        String name;
        String workingHours;
        double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name + " | Время работы: " + workingHours + " | Цена: " + price);
        }
    }
}