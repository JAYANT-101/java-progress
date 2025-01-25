interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void recordIn4k(){
        greet();
        System.out.println("record in 4k(from default interface)");
    }
}
interface wifi{
    String [] getNetwork();
    void connectTONetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+ phoneNumber);
    }
    void pickNumber(){
        System.out.println("connecting..");
    }
}
class MySmartPhone extends MyCellPhone implements wifi, Camera{
//    @Override
//    public void recordIn4k(){
//        System.out.println("this is a override from default");
//    }
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo() {
        System.out.println("recording");
    }
    public String[] getNetwork() {
        System.out.println("getting list of network");
        String [] netWorkList={"jayant", "sinha", "god"};
        return netWorkList;
    }
    public void connectTONetwork(String network) {
        System.out.println("Connecting to "+ network);
    }
}
public class Default_Methods {
    public static void main(String[] args) {
        Camera ms = new MySmartPhone();
        //ms.getNetwork(); not work because it in referance of camera not smartphone


    }
}

