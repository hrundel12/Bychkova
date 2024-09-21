public class five {
    public static void main(String[] args) {
        int number = 5; // можно изменить для проверки
        long result = calculateFactorial(number);
        System.out.println("Факториал " + number + " это: " + result);
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}