class thr extends Thread{
    public thr(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am a thread");
            i++;
        }
    }
}
class thr2 implements Runnable{
    public thr2(String name1){
super();
    }
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class ThreadConstructors {
    public static void main(String[] args) {
thr t=new thr("Jayant");
thr t2=new thr("Jayant sinha");
thr2 t3=new thr2("Jayant god sinha");
Thread j1=new Thread(t3);
t.start();
t2.start();
        j1.start();
        System.out.println("the thread id is\n"+ t.threadId());
        System.out.println("the thread name is\n"+ t.getName());
        System.out.println("the thread id is\n"+ t2.threadId());
        System.out.println("the thread name is\n"+ t2.getName());
        System.out.println("the threadr id is\n"+ j1.threadId());
        System.out.println("the threadr name is\n"+ j1.getName());
    }
}
