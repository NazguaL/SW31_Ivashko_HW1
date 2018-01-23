/**
 * Created by sergii.ivashko on 23.01.2018.
 */
public class Bank {
    public static int bestRate(float [] rates) {

        int i = 0;
        for (int j = 1; j < rates.length; j++) {
            i = rates[i] > rates[j] ? i : j;
        }
        return i + 1;

    }

}
