import java.util.Objects;
import java.util.Scanner;
class books{
    String[]book={"book1","book2","book3"};
}
class lone extends books{
    private String i;
    public void display(){
        for(String e:book ){
            if(Objects.equals(e, i)){
                System.out.println("This book is given");
            }
            else{
                System.out.println(e);
            }
        }
    }
    Scanner sc=new Scanner(System.in);
    public String lone1(String m){
        System.out.println("Enter the name of the book you want");
        m=sc.nextLine();
        return i=m;
    }
}
public class lib {
    public static void main(String[] args) {
        lone obj = new lone();
        boolean lib = true;
        Scanner bc = new Scanner(System.in);
        while (lib) {
            System.out.println("1. display book\n2. lone book\n3. end");
            int a = bc.nextInt();
            switch (a) {
                case 1 -> obj.display();
                case 2 -> obj.lone1("0");
                case 3 -> lib=false;
                default-> System.out.println("the input is not correct");
            }
        }
    }
}
