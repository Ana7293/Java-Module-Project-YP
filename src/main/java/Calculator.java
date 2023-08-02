public class Calculator {

    private double check = 0;
    private Product product;
    private Guest guest;

    public Calculator(Product product, Guest guest) {
        this.product = product;
        this.guest = guest;
    }

    public void cheakCalcForm() {
        check = product.sum / guest.guests;
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


