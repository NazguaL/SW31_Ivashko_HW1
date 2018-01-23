/**
 * Created by sergii.ivashko on 22.01.2018.
 */
public class Distance {

    public static double getDistance(float x1, float y1, float x2, float y2)
    {
        double d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d;
    }

}
