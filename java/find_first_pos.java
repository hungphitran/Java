import java.util.Scanner;
public class find_first_pos {
    public static int first_pos(String s, char c){
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        char c= sc.next().charAt(0);
        System.out.println(first_pos(s,c));
        sc.close();
    }
}
