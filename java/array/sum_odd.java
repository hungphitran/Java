package array;
import java.util.Scanner;

public class sum_odd {
    public static int sum_of_odd(int[] list_test){
        int sum=0;
        for(int x: list_test){
            if (x>0 && x % 2==1) sum+=x;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num_test=sc.nextInt();
        int[] list_test= new int[num_test];
        for (int i=0;i<num_test;i++){
            list_test[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(sum_of_odd(list_test));
    }
}
