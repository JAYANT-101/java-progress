interface bicycle{
    int a=77;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornk3();
    void blowHornmhn();
}
class avonCycle implements bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("pee");
    }
    public void speedUp(int increment) {
        System.out.println("Applying Brake");
    }
    public void applyBrake (int decrement) {
        System.out.println("Applying seepUP");
    }
    public void blowHornk3(){
        System.out.println("pee2");
    }
    public  void blowHornmhn(){
        System.out.println("pee3");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        avonCycle obj=new avonCycle();
        obj.applyBrake(1);
         obj.speedUp(2);
        System.out.println(obj.a);
        // you cant change the interface value becouse it is final
        //obj.a=12;
        obj.blowHornk3();
        obj.blowHornmhn();
    }
}
