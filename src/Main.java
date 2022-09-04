public class Main {
    public static void main(String[] args) {

        int amount;

        amount = 1100;

        int bonus = amount / 100;

        int balance = 100;

        if (bonus < 10) {
            bonus = 0;
        }

        System.out.println("Вам начисленно бонусов" + bonus);

        int cash = balance + bonus + amount;
        System.out.println("Ваш баланс составляет " + cash);
    }
}
