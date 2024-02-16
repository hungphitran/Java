package array;

import java.util.Scanner;

public class count_in_array 
{
    public static int count(int[] list_test,int num_to_count)
    {
        int cnt=0;
        for (int x :list_test)
        {
            if (x==num_to_count) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int num_test= sc.nextInt();
        int[] list_test= new int[num_test];
        for (int i=0;i<num_test;i++)
        {
            list_test[i]=sc.nextInt();
        }
        int num_to_count=sc.nextInt();
        System.out.println(count(list_test,num_to_count));
        sc.close();
    }

};
