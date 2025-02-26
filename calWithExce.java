import java.util.Scanner;

class cal{
    public void math(){
        Scanner sc=new Scanner(System.in);
        boolean tp=true;
        while (tp){
            System.out.println("Enter 1. to add\n2. to sub\n3.to multi\n4. to div\n5. to exit");
            int op = sc.nextInt();
            if(op==5){
                break;
            }
            System.out.println("Enter to number");
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (op) {
                case 1->
                    System.out.println("result " + (a + b));
                case 2->
                    System.out.println("result " + (a - b));
                case 3->
                    System.out.println("result "+(a*b));
                case 4->
                    System.out.println("result "+(a/b));
                default->
                    System.out.println("wrong in put");
            }
        }
    }
}
public class calWithExce {
    public static void main(String[] args) {
        cal obj=new cal();
        while(true) {
            try {
                obj.math();
                break;
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e);
            }
        }
    }
}
