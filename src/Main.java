public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int bonus;
        int added = 1001;
        if (added <= 1000) {
            bonus = 0;
        } else {
            bonus = added / 100;
        }
        int finish_balance = balance + added + bonus;
        System.out.println("Баланс" + finish_balance);
    }
}