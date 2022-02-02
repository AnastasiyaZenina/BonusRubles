public class Main {
    public static void main(String[] args) {
        int startingScore = 100;
        int amount = 2000;
        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        long grandTotal = startingScore + bonus + amount;
        System.out.println(grandTotal);
    }
}

