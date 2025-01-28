public class EvenNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        int num = 2;

        while (num <= 100) {
            sum += num;
            num += 2;
        }

        System.out.println("Sum of even numbers between 1 and 100: " + sum);
    }
}