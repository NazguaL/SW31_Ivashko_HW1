/**
 * Created by sergii.ivashko on 23.01.2018.
 */
public class HexagonArea {
    public static double haxagonAreaCalc(float a) {
        double area;
        area = TriangleArea.triangleAreaCalc(a) * 6;
        return area;
}
}
