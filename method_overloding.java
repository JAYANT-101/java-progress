import java.util.Scanner;
public class method_overloding {
    static void foo(){
        System.out.println("littel bitch");
    }
    static void foo(int q){
        System.out.println("littel bitch "+q);
    }

    public static void main(String[] args) {
        foo();
        Scanner sc=new Scanner(System.in);
        System.out.println("give value");
        int q =sc.nextInt();
        foo(q);
    }
}
