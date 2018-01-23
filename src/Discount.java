/**
 * Created by sergii.ivashko on 23.01.2018.
 */
public class Discount {

    public static float discountCalc(float sum)
    {
        float s = 0;
        if (sum < 1001)  s = sum;
        if (sum >= 1001 && sum < 2001) s = sum - sum * 0.02F;
        if (sum >= 2001 && sum < 5001) s = sum - sum * 0.05F;
        if (sum >= 5001) s = sum - sum * 0.07F;
        return s ;
    }

}
