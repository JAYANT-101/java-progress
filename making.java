class patten{
    public void oneSide(){
        for(int i=0;i<6;i++) {
            System.out.println(" ");
            for (int j = 0; j<i;j++){
                System.out.print("*");
            }
        }
    }
}
class patten2 extends patten{

}
public class making {
    public static void main(String[] args) {
        patten onj=new patten();
        onj.oneSide();
    }
}
