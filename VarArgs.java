public class VarArgs {
    /*
    static int sum(int ...arr) {
        int r = 0;
        for (int b : arr) {
            r += b;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2));
    }
    */
    static int sum(int x ,int ...arr) {
        int r=0;
        r += x;
        for (int b : arr) {
            r += b;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(sum(12,23,1));
    }
}
