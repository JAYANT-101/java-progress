import java.util.Scanner;
public class revers_wile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a four digit number");
        int a,r;
        a =sc.nextInt();
        System.out.println("The revers number are");
        while(a>0){
            r=a%10;
            System.out.print(r);
            a=a/10;

        }

    }
}
