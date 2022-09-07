import java.util.Scanner;

public class rice_bag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = in.nextInt();
        System.out.println("Enter the no of box: ");
        long e = in.nextInt();
        System.out.println(~(n<<(e - 1)));
    }
}

