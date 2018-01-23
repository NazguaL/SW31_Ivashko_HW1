/**
 * Created by sergii.ivashko on 23.01.2018.
 */
public class oodFactorials {

    public static long factorialsumm()
    {
        long result = 0;
        for (int i = 1; i <= 9; i++) {
        if ( i % 2 == 1) {
            result = result +  FactorialCalc.factorial(i);
    }
        }
    return result;
    }



}
