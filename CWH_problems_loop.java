import java.util.Scanner;
public class CWH_problems_loop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rows = 5; // Number of rows in the pattern
        int i = 1; // Initialize row counter

        while (i <= rows) {
            int j = 5; // Initialize column counter

            while (j > i) {
                System.out.print("* "); // Print the pattern element
                j--;
            }

            System.out.println(); // Move to the next line
            i++;
        }
    }
}
