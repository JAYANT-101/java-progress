import java.util.Scanner;
public class problem {
  /*  static void multiplcationtable(int a){
        for (int i=1; i<=10;i++ ){

            System.out.format("%d*%d=%d\n",i,a,a*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        multiplcationtable(n);
    }

   */
    //problem 2
   /* static void patten(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
}
static void patten1(int b){
    for(int i=1;i<=b;i++){
        for(int j=b;j>=i;j--){
            System.out.print("*");
        }
        System.out.println("");
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choice the pattens;\n1 rt\n2 rrt\n3 rt and rrt");
        int c= sc.nextInt();
        switch (c){
         case 1 -> {System.out.println("entre the number");
             int a=sc.nextInt();
             patten(a);
         }
         case 2 ->{System.out.println("entre the number");
             int a=sc.nextInt();
             patten1(a);
         }
            case 3 -> {int v,b;
                System.out.println("enter vale for patten 1 and 2");
                v=sc.nextInt();
                b=sc.nextInt();
                patten(v);
                patten1(b);
            }
            default -> throw new IllegalStateException("Unexpected value: " + c);
        }
    }

    */
    // problem 3
   /* static int sum(int a){
        if(a==1){
            return 1;
        }
        return (a+sum(a-1));
    }

    public static void main(String[] args) {
        Scanner sx=new Scanner(System.in);
        System.out.println("enter a number");
        int b=sx.nextInt();
        sum(b);
        System.out.println(sum(b));
    }

    */ //problem 4
    static float avg(int ...arr){
        float r=0;
        for (int d:arr){
            r+=d;
        }
        r=r/arr.length;
        return r;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter count of the number");
        int a=sc.nextInt();
        int [] arry=new int[a];
        for(int i=0;i<a;i++){
            System.out.print("Element " + (i + 1) + ": ");
            arry[i]=sc.nextInt();
        }
        System.out.println(avg(arry));
    }
        }


