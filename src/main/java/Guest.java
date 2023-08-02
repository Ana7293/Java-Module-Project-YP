public class Guest {
    int guests;
    public void numGuests() {
        System.out.println("Здравствуйте. Введите количество гостей:");
        while (true) {
            String guestsStr = Main.scanner.next();
            try {
                int ans = Integer.parseInt(guestsStr);
                if (ans <= 1) {
                    throw new RuntimeException();
                }
                guests = ans;
                return;
            } catch (Exception e) {
                System.out.println("Ошибка, попробуйте еще раз!\n----------");
                System.out.println("Введите количество гостей:");
            }
        }
    }
}
