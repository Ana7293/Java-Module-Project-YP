import java.util.ArrayList;

public class Product {
    String name;
    double price;
    double sum = 0;
    ArrayList<String> listPro = new ArrayList<>();

    public void products() {

        System.out.println("Укажите название и стоимость каждого товара?");
        name = "";
        boolean isProductInputFinished = false;
        while (!isProductInputFinished) {
            System.out.println("Название товара:");
            name = Main.scanner.next();
            if (name.equalsIgnoreCase("завершить")) {
                isProductInputFinished = true;
                continue;
            }
            listPro.add(name);
            priceSum();
            System.out.println("Товар успешно добавлен!\n----------");
            System.out.println("Хотите добавить еще один товар? Если нет, то введите - Завершить");
        }

    }

    private void priceSum() {
        System.out.println("Стоимость товара = ");
        String priceStr = Main.scanner.next();
        try {
            price = Double.parseDouble(priceStr);
        } catch (Exception e) {
            price = -1;
        }
        if (price < 0.0) {
            System.out.println("Введите корректную стоимость товара:");
            priceSum();
            return;
        }
        sum = sum + price;
    }
    public void shoplist() {
        System.out.println("----------\nДобавленные товары:");
        for (int i = 0; i < listPro.size(); i++) {
            System.out.println(listPro.get(i));
        }
    }
}

