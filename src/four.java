import java.util.Arrays;
import java.util.Random;

public class four {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println("Массив созданный с использованием класса Math.random():");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));

        Random random = new Random();
        System.out.println("Массив созданный с использованием класса Random:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
}