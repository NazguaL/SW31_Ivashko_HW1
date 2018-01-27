/**
 * Created by sergii.ivashko on 22.01.2018.
 */
public class Triangle {
    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean isTriangle(int a, int b, int c)
    {
        if (a <= 0 || b <=0  || c <= 0) {return false;}
        else if (a >= b + c || b >= a + c || c >= a + b) {return false;}

            else return true;
        }
    }

