class thrP extends Thread{
    public thrP(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("I am a thread"+ this.getName());
            i++;
        }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        thrP t1=new thrP("jayant (most important)");
        thrP t2=new thrP("jaya");
        thrP t3=new thrP("papu");
        thrP t4=new thrP("tpipi");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
//        System.out.println("t1 id is "+ t1.getName());
//        System.out.println("t2 name is "+ t2.getName());
//        System.out.println("t3 id is "+ t3.getName());
//        System.out.println("t4 name is "+ t4.getName());

    }
}
