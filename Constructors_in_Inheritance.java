import java.sql.SQLOutput;

class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int a){
        System.out.println("i am a over loaded construcotor "+a);
    }
       }
       class Drived1 extends base1 {
    Drived1(){
        System.out.println("con frm drive 1");
    }
           Drived1(int x, int y) {
               super(x);
               System.out.println("i am Drived class constructor "+y);
           }
       }
       class Drives2 extends Drived1{
    Drives2(){
        System.out.println("con from d2");
    }
    Drives2(int x, int y, int z){
        super(x,y);
        System.out.println("i am a Dribed 2 overloaded construcor "+z);
    }
}
public class Constructors_in_Inheritance {
    public static void main(String[] args) {
        //base1 b=new base1();
        //Drived1 a=new Drived1(2,43);
        Drives2 c= new Drives2(3,4,5);
    }
}
