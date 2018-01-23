public class Main {

    public static void main(String[] args) {
        //Factorial:
        long fact = 9;
        System.out.println(FactorialCalc.factorial(fact));
        //GetDistance:
        float x1 = 1;
        float x2 = 1;
        float y1 = 1;
        float y2 = 3;
        System.out.println(Distance.getDistance(x1, x2, y1, y2));
        //Triangle
        int a = 10;
        int b = 11;
        int c = 12;
        System.out.println(Triangle.isTriangle(a, b, c));
        //TriangleLoop
        System.out.println(TriangleLoop.triangle());
        //BMI
        float mass = 90;
        float height = 1.85F;
        //DoubleNumbers
        //Scanner sc = new Scanner(System.in); non static
        //int x =  sc.nextInt();
        //int y =  sc.nextInt();
        //int z =  sc.nextInt();
        int x = 1000;
        int y = 3000;
        int z = 3000;
        System.out.println(DoubleNumbers.isDouble(x, y, z));
        //Pool
        float h = 2;
        float l = 50;
        float w = 30;
        System.out.println(Pool.poolVolume(h, l, w) + " Litres");
        //Exam
        int[] marks = {2, 4, 4, 5, 5, 2, 3, 2, 5};
        System.out.println(Exam.nextExam(marks) + " Student(s)");
        //Banks
        float[] rates = {28.1F, 29.3F, 28.9F};
        System.out.println("Best bank is #: " + Bank.bestRate(rates));
        //PrintStringNtimes
        String S = "8000";
        int N = 10;
        System.out.println(Print.prnStr(S, N));
        //TriangleArea
        float at = 10;
        System.out.println(TriangleArea.triangleAreaCalc(at));
        //HexagonArea
        float ah = 10;
        System.out.println(HexagonArea.haxagonAreaCalc(ah));
        //from1to9oddFactorials
        System.out.println(oodFactorials.factorialsumm());
        //Discount
        float sum = 3000;
        System.out.println(Discount.discountCalc(sum));
    }
}
