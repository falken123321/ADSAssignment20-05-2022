package CoinProblem;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int coins[] =  {1, 7, 10, 22};
        System.out.println("Required is "+ coinsProblem.Utopia(coins, 50));

        ArrayList<Integer> d = coinsProblem.creteTable(coins,50);
        System.out.print("[");
        for (Integer value: d) {
            System.out.print(value +",");
        }
        System.out.print("]");
    }
}
