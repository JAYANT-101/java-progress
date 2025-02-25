class loop{
    public static void whi(){
        while (true){
            try{
                float a=7,b=8;
                float c=a/b;
                System.out.println(c);
                break;
            }
            catch (Exception e){
                System.out.println(e);
            }
            finally {
                System.out.println("Remove all data");
            }
        }
    }
}
public class Finally2 {
    public static int greet(){
        try{
            int a=50;
            int b=2;
            int c= a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("end of function");
        }
        return 0;
    }

    public static void main(String[] args) {
        int k=greet();
        System.out.println(k);
        loop dc=new loop();
        dc.whi();
    }

}
