import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[100];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        int sum= arr[0]+arr[n-1];
        System.out.println(sum);
        sc.close();
    }
}