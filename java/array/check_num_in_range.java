package array;
import java.util.Scanner;

public class check_num_in_range {
    public static void check_in_range(int[] list){
        for (int x: list){
            if(x>=0 && x<=10) System.out.print(x+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num_test=sc.nextInt();
        int[] list= new int[num_test];
        for (int i=0;i<num_test;i++){
            list[i]=sc.nextInt();
        }
        check_in_range(list);
        sc.close();
    }
}
