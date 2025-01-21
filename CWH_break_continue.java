import java.util.Scanner;
public class
CWH_break_continue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        continue
        int a,b,i;
        System.out.println("Enter the rang");
        a=sc.nextInt();
        System.out.println("Enter the number you need to find the devesibuls of");
        b=sc.nextInt();
        for(i=1;i<=a;i++){
            if(i%b!=0){
                continue;
            }
            System.out.println(i);
        }

         */
        //break
        int a,b,i;
        System.out.println("Enter the rang");
        a=sc.nextInt();
        System.out.println("Enter the number you want to break the loop");
        b=sc.nextInt();
        for(i=1;i<=a;i++){
            if(i==b){
                break;
            }
            System.out.println(i);
        }


    }
}
