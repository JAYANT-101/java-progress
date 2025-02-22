import java.util.Scanner;

public class SpecificExceptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of thr arr");
        int d=sc.nextInt();
        int [] arr=new int[d];
        for(int i=0;i< arr.length;i++){
            System.out.println("Enter the number");
            int a= sc.nextInt();
            arr[i]=a;
        }
        System.out.println("Enter the index of arr size "+d);
        int inx= sc.nextInt();
        System.out.println("Enter the number you want to divide with");
        int num=sc.nextInt();
        try{
            System.out.println("The value at thr arr index is "+arr[inx]);
            System.out.println("The value of arr-value/number is "+arr[inx/num]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e+"\nEnter the index in rang of 0 to "+d);
        }
        catch (ArithmeticException f){
            System.out.println(f);
        }
        catch (Exception g){
            System.out.println("some other exception happen\n"+g);
        }
    }
}
