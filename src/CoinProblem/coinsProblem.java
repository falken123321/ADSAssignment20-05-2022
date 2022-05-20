package CoinProblem;

import java.util.ArrayList;

public class coinsProblem {

    //Recursive Function
    public static int Utopia(int coins[], int N) {

        //END
        if (N == 0) {
            return 0;
        }

        //Initialize result  (Set to 99999999, to compare with other recursive lifespans)
        int res = 99999999;

        // ForI for each value below N
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= N) {
                //Create another recursive lifespan
                int OtherRecursiveLifespan = Utopia(coins, N - coins[i]);

                // Check for overflow and if result can be minimized
                if (OtherRecursiveLifespan != 99999999 && OtherRecursiveLifespan + 1 < res)
                    res = OtherRecursiveLifespan + 1;
            }
        }
        return res;
    }

    //Just using the recursive function for each number under N, and returning it in an arraylist
    public static ArrayList<Integer> creteTable(int coins[], int N) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 1; i < N+1; i++) {
            temp.add(Utopia(coins,i));
        }
        return temp;
    }
}
