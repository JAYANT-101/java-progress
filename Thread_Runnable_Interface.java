class Mytr implements Runnable{
    @Override
    public void run(){
        int i=0;
        while (i<100) {
            System.out.println("I am a thread");
            i++;
        }
    }
}class Mytr2 implements Runnable{
   @Override
    public void run(){
       int j=0;
       while(j<100) {
           System.out.println("I am a thread2");
           j++;
       }
    }
}
public class Thread_Runnable_Interface {
    public static void main(String[] args) {
Mytr t1=new Mytr();
Thread j1=new Thread(t1);
Mytr2 t2=new Mytr2();
Thread j2=new Thread(t2);
j1.start();
j2.start();
    }
}
