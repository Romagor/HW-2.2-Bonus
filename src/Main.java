public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int depositAmount = 1100;

        int finalAccount;
        int bonus;

        if (depositAmount >= 1100) {
            bonus = depositAmount / 100;
            finalAccount = initialAccount + depositAmount + bonus;
        } else {
            bonus = 0;
            finalAccount = initialAccount + depositAmount;
        }
        System.out.println((bonus) + " бонус");
        System.out.println((finalAccount) + " итоговый счёт");
    }
}
