import java.util.Scanner;
public class if_and_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter pp size(in inch)");
        int pp_size = sc.nextInt();
        if(pp_size>5){
            System.out.println("average");
        }
        else{
            System.out.println("sill average");
        }


    }
}
