public class TernaryOperator {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        // Find maximum
        int max = (a > b) ? a : b;
        System.out.println("Maximum value: " + max);

        // Check even or odd
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("a is: " + result);
    }
}

