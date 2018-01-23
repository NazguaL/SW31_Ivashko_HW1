/**
 * Created by sergii.ivashko on 22.01.2018.
 */
public class Exam {

    public static int nextExam(int [] marks) {

        int result = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 3) {result = result + 1;}

        }
        return result;
    }
}