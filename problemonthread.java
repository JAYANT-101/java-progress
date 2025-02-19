class gm extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<500){
            System.out.println("Good morning");
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }
}class gn extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<500){
            System.out.println("Good night");
            i++;
        }
    }
}

public class problemonthread {
    public static void main(String[] args) {
gm t1=new gm();
gn t2=new gn();
t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(4);
t1.start();
t2.start();
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
    }
}
