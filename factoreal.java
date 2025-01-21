import java.util.Scanner;
public class factoreal {
    static int fcat(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fcat(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 for squr and 2 for fact");
        int s= sc.nextInt();
            System.out.println("Enter the number you want to find the factoreal of");
            int n = sc.nextInt();
            System.out.println("the factoreal is " + fcat(n));
    }
}