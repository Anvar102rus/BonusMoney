public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int replenishmentAmount = 1000;
        int depositAmountToReceiveAbonus = 100;

        int bonus;
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount/depositAmountToReceiveAbonus ;
        } else {
            bonus = 0;
        }
         int Total = clientAccount+replenishmentAmount+bonus;

        System.out.println(Total);
        System.out.println(bonus);


    }
}
