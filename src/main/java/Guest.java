import java.util.InputMismatchException;
public class Guest {
    static int guestIto;
    static int guests;
    public static int numGuests() {
        System.out.println("Здравствуйте. Введите количество гостей:");
        String guestsStr = Main.scanner.next();
        try {
            guests = Integer.parseInt(guestsStr);
        } catch (Exception e) {
            guests = -1;
        }
            while (true) {
                if (guests <= 1) {
                    while (guests <= 1) {
                        System.out.println("Ошибка, попробуйте еще раз!\n----------");
                        System.out.println("Введите количество гостей:");
                        guests = Main.scanner.nextInt();
                    }
                } else {
                    guestIto = guests;

                }
                return guestIto;
            }
    }
}
