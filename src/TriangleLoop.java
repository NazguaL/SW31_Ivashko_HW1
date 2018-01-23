/**
 * Created by sergii.ivashko on 22.01.2018.
 */
public class TriangleLoop {

    public static String triangle() {
        String result = "";
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                result = result + "0";
            }
            result = result + "\n";
        }
        return result;
    }
}
