public class two {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments passed.");
        } else {
            System.out.println("Arguments passed:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}