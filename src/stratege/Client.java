package stratege;

public class Client {

    public static void main(String[] args) {
        double total = 0;
        CashContext csuper = new CashContext("normal");
        double totalPrice = 0;
        totalPrice = csuper.getResult(1000);
        total = totalPrice + total;
        System.out.println(total);
    }
}
