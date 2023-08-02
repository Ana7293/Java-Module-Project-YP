import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Guest guest = new Guest();
        Product product = new Product();
        Calculator calc = new Calculator(product, guest);

        guest.numGuests();
        product.products();
        product.shoplist();
        calc.cheakCalcForm();
    }
}
