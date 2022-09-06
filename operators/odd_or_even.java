import java.util.*;
public class odd_or_even {
    public static boolean check(int n){
        if((n^1)==n+1)
            return true;
        else
           return false;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        System.out.print(check(n)==true?"even":"odd");
    }
}
