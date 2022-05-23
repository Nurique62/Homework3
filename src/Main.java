public class Main {

    public static void main(String[] args) {
        int original = 3000;
        int payment = 15100;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int total = original + payment + bonus;
        System.out.println("Начислено бонусов:" + bonus);
        System.out.println("Итоговый счет:" + total);
    }
}