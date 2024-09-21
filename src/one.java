public class one {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма с использованием for: " + sum);

        sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        System.out.println("Сумма с использованием while: " + sum);

        sum = 0;
        i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < array.length);
        System.out.println("Сумма с использованием do-while: " + sum);
    }
}