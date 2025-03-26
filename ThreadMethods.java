class thrM extends Thread{
    public thrM(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("My name is "+ this.getName());
            try{
                Thread.sleep(40);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class thrM2 extends Thread{
    public thrM2(String name){
        super(name);
    }
    @Override
    public void run(){
        int j=0;
        while(j<100){
            System.out.println("I name is " + this.getName());
            j++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        thrM t1=new thrM("jayant");
        thrM2 t2=new thrM2("jaya");
        t1.start();
//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e); this to make it so the t1 thread is completed first then other method are used
//        }
        t2.start();


    }

}
