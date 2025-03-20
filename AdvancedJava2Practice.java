import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//class P2{
//    @SuppressWarnings("Deprected")
//    @Deprecated
//    public void meth1(){
//        System.out.println("Making a method bro");
//    }
//}
//interface MyInt{
//    void display();
//}
//public class AdvancedJava2Practice {
//    public static void main (String[]args){
//        P2 obj=new P2();
//        obj.meth1();
//        MyInt i=() -> System.out.println("display method");
//    }
//}
public class AdvancedJava2Practice {
    public static void main(String[] args) {
//        File Multeble=new File("Mtable.txt");
//        try{
//            Multeble.createNewFile();
//        }
//        catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Enter the number the you want table of");
        Scanner sc =new Scanner(System.in);
        int i=sc.nextInt();
        String table= "";
        for(int j=1;j<=10;j++){
            table += i+" X "+j+" = "+ i*j;
            table += "\n";
        }
        try{
            FileWriter Muteble=new FileWriter("Mtable2.txt");
            Muteble.write(table);
            Muteble.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}