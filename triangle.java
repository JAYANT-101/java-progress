import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b<=c||a+c<=b||b+c<=a){
            System.out.println("Not a triangle");
            return;
        }
        System.out.println("It is a triangle");
        if(a==b&&b==c&&c==a){
            System.out.println("Its a equilateral triangle");
        }
        else if(a==b||b==c||c==a){
            System.out.println("Its a isosceles triangle");
        }
        else{
            System.out.println("Its a scalene triangle");
        }
    }
}
