public class Calculator {

    static double check = 0;
    public static void cheakCalcForm() {
        check = Product.sum / Guest.guestIto;
        double checkF = Math.floor(check);
        int checkO = (int) checkF % 10;
    switch (checkO)
    {
        case 1:
            System.out.println(String.format("%.2f", check) + " рубль");
            break;
        case 2:
        case 3:
        case 4:
            System.out.println(String.format("%.2f", check)  + " рубля");
            break;
        default:
            System.out.println(String.format("%.2f", check)  + " рублей");
            break;
    }
    }
}


