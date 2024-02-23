import java.util.Scanner;
public class luy_thua {
    public static long luythua(int a,int b){
        long res=1;
        while(b>0){
            res*=a;
            b--;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println(luythua(a,b));
    }
}
