import java.util.Random;
import java.util.Scanner;
public class RPS_game {
    public static void main(String[] args) {
        System.out.println("0 rock , 1 paper , 2 scissors");
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();
        int a=sc.nextInt();
        int b = rand.nextInt(3);
        if(a>2){
            System.out.println("wrong entry");
            return;
        }
        if(a==b){
            System.out.println("tai");
        }
        else if(a==0&b==2||a==2&b==1||a==1&b==0){
            System.out.println("you win");
        }
        else if(a==0&b==1||a==1&b==2||a==2&b==0){
            System.out.println("you loss");
        }

        System.out.println(b);

    }
}
