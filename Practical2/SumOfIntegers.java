import java.util.Scanner;

public class SumOfIntegers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start integer：");
        int startValue = input.nextInt();

        System.out.print("Enter the end integer：");
        int endValue = input.nextInt();

        if (endValue >= startValue) {
            int sum = 0;
            int current = startValue;

            while (current <= endValue) {
                sum += current;
                current++;
            }

            // get the sum
            System.out.println("From " + startValue + " to " + endValue + ", we get the sum is: " + sum);
        }

        else {
            // If the start is larger than end, this code work
            System.out.println("The end number must larger than end ");
        }
    }
}
