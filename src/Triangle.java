/**
 * Created by sergii.ivashko on 22.01.2018.
 */
public class Triangle {

    public static boolean isTriangle(int a, int b, int c)
    {
        if (a >= b + c||b >= a + c||c >= a + b) return false;
        else return true;
    }
}
