public class three {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Первые 10 гармоничных чисел:");
        for (int i = 1; i <= n; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.printf("H%d = %.4f%n", i, harmonicNumber);
        }
    }
}
