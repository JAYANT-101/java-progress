import java.util.Scanner;
class cylinder{
    private int a,b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public double volume(double v){
        double pi=Math.PI;
        v=pi*(a*a)*b;
        return v;
    }
}
public class problem9 {
    public static void main(String[] args) {
        cylinder c1=new cylinder();
        Scanner sc=new Scanner(System.in);
        double cv =0;
        System.out.println("enter hight");
        int h=sc.nextInt();
        System.out.println("enter redus");
        int r=sc.nextInt();
        c1.setA(h);
        c1.setB(r);
        System.out.println(c1.getA());
        System.out.println(c1.getB());
        System.out.println(c1.volume(cv));
    }
}