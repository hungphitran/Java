
import java.util.Scanner;
public class first_pos_of_str {
    public static int check(String a,String b){
        a=a.toLowerCase();
        b=b.toLowerCase();

        for (int i=0;i<a.length()-b.length()+1;i++){
            if (b.equals(a.substring(i, i + b.length()))) return i;
        }

        return -1;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(check(a,b));
        sc.close();
    }
}
