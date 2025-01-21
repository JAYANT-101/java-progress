import java.util.Random;
import java.util.Scanner;
class ngg{
    public void isCorrect(int i){
        Random random=new Random();
        int a=random.nextInt(100);
        for( i=1;i<=10;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("chance "+i);
            int b= sc.nextInt();
            if(b==a){
                System.out.println("yor are correct "+a+" and the number of guess are "+i);
            }
            else if (b>a){
                System.out.println("the number is bigger");
            }
            else if (b<a){
                System.out.println("number is small");
            }
        }
    }
}
public class Guess_the_Number {
    public static void main(String[] args) {
        Scanner np=new Scanner(System.in);
        System.out.println("enter the no of try");
        int v= np.nextInt();
        ngg gussingGame=new ngg();
        gussingGame.isCorrect(v);
    }
}

