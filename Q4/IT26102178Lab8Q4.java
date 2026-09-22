import java.util.Scanner;

public class IT26102178Lab8Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] studentsArray = new int[8];
        int count = 0;
        int searchID;
        boolean found = false;

        while (count < 8) {

            System.out.print("Enter Student ID for Student "
                    + (count + 1) + ": ");

            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println(
                        "Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = id;
                count++;
            }
        }

        System.out.println();
        System.out.print("Enter a Student ID to Search: ");
        searchID = sc.nextInt();

        for (int i = 0; i < 8; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        System.out.println();

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        sc.close();
    }
}
