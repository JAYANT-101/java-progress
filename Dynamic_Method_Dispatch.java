class one{
    public void name(){
        System.out.println("My name is java");
    }
    public void greet(){
        System.out.println("Good morning");
    }
}
class two extends one{
    @Override
    public void name(){
      System.out.println("My name id java in class two");
    }
    public void swagat(){
        System.out.println("Aapka swagat hai");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//    one obj=new one();
//    two smboi=new two();
//    obj.name();
        one obg=new two();
        obg.greet();
        obg.name();
    }
}
