import java.sql.SQLOutput;
import java.util.Scanner;
public class CWH_problem_set_4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        /*
         Q2
        System.out.println("enter the total marks of a all subjects");
        int tms=sc.nextInt();
        System.out.println("enter the marks of the three subject");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float tp;
        tp=(a+b+c)/tms*100f;
        if(a>32&&b>32&&c>32&&tp>40){
            System.out.println("you pass");
        }
        else{
            System.out.println("you fail");
        }
        System.out.println(tp);
       */
        // Q3
        System.out.println("enter salary");
        float sal=sc.nextFloat();
        if(sal<250000){
            System.out.println("no tax");

        }
        else if (sal>=250000&&sal<=500000){
            System.out.println(sal/5);
        }
        else if(sal>500000&&sal<=1000000){
            System.out.println(sal/20);
        }
        else if(sal>1000000){
            System.out.println(sal/30);
        }
    }
}
