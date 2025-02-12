class MyThread extends Thread{
    @Override
    public void run(){
        int i=0;
        while( i<100) {
            System.out.println("My thread is running");
            System.out.println("1");
            i++;
        }
    }

}class MyThread2 extends Thread{
    @Override
    public void run(){
        int j=0;
        while(j<100) {
            System.out.println("My thread2 is running");
            System.out.println("2");
            j++;
        }
    }

}
public class ThreadTry {
    public static void main(String[] args) {
MyThread t1=new MyThread();
MyThread2 t2=new MyThread2();
t1.start();
t2.start();
    }
}
