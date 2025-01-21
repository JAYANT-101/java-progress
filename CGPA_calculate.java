import java.util.*;
public class CGPA_calculate {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);
        float h;
        System.out.println("Enter marks of sub 1");
        float a = pp.nextFloat();
        System.out.println("Enter marks of sub 2");
        float b = pp.nextFloat();
        System.out.println("Enter marks of sub 3");
        float c = pp.nextFloat();
        System.out.println("Enter marks of sub 4");
        float d = pp.nextFloat();
        System.out.println("Enter marks of sub 5");
        float e = pp.nextFloat();
        h=((a+b+c+d+e)/5f)/9.5f;
        System.out.println("your total cgpa");
        System.out.println(h);



    }

}
