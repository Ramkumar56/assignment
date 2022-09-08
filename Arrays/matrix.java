import java.util.*;
public class matrix {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][3];
        int arr[][]=new int[2][3];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.println("Enter the Number of 2X2: "+i+"X"+j);
                a[i][j]=s.nextInt();}
        }
        for(int i=0;i<2;i++) {
            for(int j=0;j<3;j++) {
                System.out.println("Enter the Number of 2X3: "+i+"X"+j);
                b[i][j]=s.nextInt();}
        }
        int i,j,k;
        for(i=0;i<2;i++) {
            for(j=0;j<3;j++) {
                for(k=0;k<2;k++) {
                    arr[i][j]+=a[i][k]*b[k][j];}
                System.out.print(arr[i][j]+" ");}
            System.out.println();
        }
    }
}
