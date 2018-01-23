/**
 * Created by sergii.ivashko on 22.01.2018.
 */
public class BMI {

    public static float bmiCalc(float mass, float height) {
        float bmi;
        bmi = mass / ( height * height);
        return bmi;
    }

}
