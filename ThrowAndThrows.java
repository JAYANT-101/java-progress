class ex extends Exception{
    @Override
    public String getMessage() {
        return "Negitive number not excepted";
    }

    @Override
    public String toString() {
        return "Negitive number not excepted";
    }
}
public class ThrowAndThrows {
    public static double radius(double r) throws ex{
        if(r<0){
            throw new ex();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static int devide(int a,int b) throws ArithmeticException{
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            double ar=radius(8);
            int c = devide(9, 0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
