import java.util.Scanner;

public class IT26102178Lab8Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;
        int max;

        while (count < 6) {

            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = num;
                count++;
            }
        }

        max = numbers[0];

        for (int i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println();
        System.out.println("Array Contents:");

        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("The Maximum Number Entered: " + max);

        sc.close();
    }
}
