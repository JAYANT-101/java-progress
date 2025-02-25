import java.util.Scanner;
class mt extends Exception{
    @Override
    public String toString() {
        return "Error";
    }

    @Override
    public String getMessage() {
        return "error2";
    }
}

class add{
    public static void div() throws ArithmeticException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter to number");
        float b=sc.nextInt();
        float c=sc.nextInt();
        System.out.println(b/c);
    }
    public static void pip() throws NegativeArraySizeException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int r=sc.nextInt();
        System.out.println(r*r*Math.PI);
    }
    public static void lip() throws mt{
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter to number");
        a= sc.nextInt();
        b= sc.nextInt();
        if(a==1){
            throw new mt();
        }
        else {
            System.out.println(a+b);
        }

    }
}
public class problemOnException {
    public static void main(String[] args) {
        add onj=new add();
        try{
            onj.div();
            try{
                onj.pip();
                try{
                    onj.lip();
                }
                catch (Exception e){
                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
                }
            }
            catch (NegativeArraySizeException e){
                System.out.println(e);
                System.out.println("hehe");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("HaHa");
        }
    }
}
