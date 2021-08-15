public class Main {
    public static void main(String[] args) {
        int ClientAccount = 100;
        int ReplenishmentAmount = 1000;
        int DepositAmountToReceiveAbonus = 100;

        int bonus;
        if (ReplenishmentAmount >= 1000) {
            bonus = ReplenishmentAmount/DepositAmountToReceiveAbonus ;
        } else {
            bonus = 0;
        }
         int Total = ClientAccount+ReplenishmentAmount+bonus;

        System.out.println(Total);
        System.out.println(bonus);


    }
}
