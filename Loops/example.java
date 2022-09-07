import java.util.*;
public class example {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        System.out.println("Enter the sequence: ");
        int seq=in.nextInt();
        System.out.println(n<<(seq-1));
    }
}
