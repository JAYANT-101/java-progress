import java.util.Scanner;
public class CWH_switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int a = sc.nextInt();
        switch (a) {
            case 56 -> System.out.println("fuckinf old");
            case 46 -> System.out.println("somewhat old");
            case 26 -> System.out.println("fine");
            default -> System.out.println("have fun");
        }
        /*
        if(a > 56){
            System.out.println("fucking old");
        }
        else if(a>46){
            System.out.println("somewhat old");
        }
        else if(a>36){
            System.out.println("fine");
        }
        else {
            System.out.println("not exsepted");
        }

         */
    }
}
