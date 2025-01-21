import java.sql.SQLOutput;
import java.util.Scanner;
public class problems3 {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);
        System.out.println("Enter string");
        String a = pp.nextLine();
        //Q1
        //String bitchboy = a.toLowerCase();
        //System.out.println(bitchboy);
        // Q2
        //System.out.println(a.replace(' ','_'));
        //Q3
        //a = a.replace("<|name|>", "JAYANT");
        //System.out.println(a);
        //Q3
        System.out.println(a.indexOf("  "));
        System.out.println(a.indexOf("   "));

    }
}
