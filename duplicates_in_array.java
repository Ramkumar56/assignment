import java.util.*;
public class duplicates_in_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
            array[i]=in.nextInt();
        Arrays.sort(array);
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<array.length-1;i++) {
            if((array[i]^array[i+1])==0)
                arr.add(array[i]);
        }
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i)+" ");

    }
}
