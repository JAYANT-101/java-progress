import java.util.Scanner;
public class Add_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum;
        sum=a+b+c;
        System.out.println("rusult ="+sum);
    }
}
