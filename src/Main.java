public class Main {
    public static void main(String[] args) {
        int amount = 1000;
        boolean isRegistered = true;

        int percent;
        if (isRegistered) {
            percent = 5;
        } else {
           percent = 1;
        }
        //int percent = isRegistered ? 3 : 1;

        int bonus = amount * percent / 100;

        if (bonus > 100) {
            bonus = 100;
        }

        System.out.println("Итоговый бонус: " + bonus);
    }
}