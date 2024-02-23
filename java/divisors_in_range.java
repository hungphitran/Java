import java.util.Scanner;
public class divisors_in_range {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int begin=sc.nextInt();
        int end=sc.nextInt();
        for (;begin<=end;begin++){
            if (begin%3==0 && begin%5==0) System.out.print(begin+" ");
        }
    }
}
