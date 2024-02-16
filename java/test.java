import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int min=-1;
		for (int i=0;i<3;i++)
        {
            int tmp=sc.nextInt();
            if (tmp>min) min=tmp;
        }
        sc.close();
        System.out.println(min);
	}
}