public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int deposit = 500;

        if (deposit > 1000) {
            int bonus = deposit/100;
            System.out.print(balance+deposit+bonus);System.out.println(" Рублей");
            System.out.print("Из них ");System.out.print(bonus);System.out.println(" Бонусных рублей");
        }else {
            System.out.print(balance+deposit);System.out.println(" Рублей");
            System.out.println("Бонусные рубли отсутствуют");
        }
    }
}