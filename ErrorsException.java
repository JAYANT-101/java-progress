
public class ErrorsException {
    public static void main(String[] args) {
        int a=6;
        int b=0;
        try {
            int c = a / b;
            System.out.println("the result id " + c);
        }
        catch (Exception e){
            System.out.println("we fail to divide because "+ e);
        }
        System.out.println("end");
    }
}
