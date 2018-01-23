/**
 * Created by sergii.ivashko on 22.01.2018.
 */
public class FactorialCalc {

    public static long factorial(long n)
    {
        if (n < 0)  return 0;
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
}
