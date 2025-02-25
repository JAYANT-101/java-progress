import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int []marks=new int[5];
        marks[0]=7;
        marks[1]=3;
        marks[2]=5;
        Scanner sc=new Scanner(System.in);
        boolean a=true;
        while (a) {
            System.out.println("Enter the value of index");
            int ind =sc.nextInt();
            try {
                System.out.println("try 1");
                try {
                    System.out.println(marks[ind]);
                    a=false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("out of bound");
                    System.out.println("Exception in level 2");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Exception in level one");
            }
            System.out.println("end");
        }
    }
}
