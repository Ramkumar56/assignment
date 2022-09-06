import java.util.*;
public class swap_two_numbers_using_bitwise {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a=in.nextInt();
        System.out.println("Enter the number b:");
        int b=in.nextInt();
        System.out.println("The two numbers before swap:" +a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("The two numbers after swap:" +a+" "+b);
    }
}
