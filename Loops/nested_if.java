import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<18) {
            System.out.println("consider as minor not to work");
        }
        else {
            if(n>=18 && n<=50) {
                System.out.println("eligible to work");
            }
            else {
                System.out.println("age is not satisfactory to work");
            }
        }
    }
}
