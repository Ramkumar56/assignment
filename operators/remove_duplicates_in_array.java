import java.util.*;

import java.util.*;
public class remove_duplicates_in_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
            array[i]=in.nextInt();
        Arrays.sort(array);
        List<Integer> arr= new ArrayList<>();
        int a=array[0];
        int  i=1;
        int count =1;
        while(i<=array.length) {

            while(i<array.length && (a^array[i])==0){ i++; count++;}
            if(count==1)
                arr.add(a);

            count=1;
            if(i<array.length)
            {
                a=array[i++];
                continue;
            }
            i++;
        }
        for(i=0;i<arr.size();i++)
            System.out.print(arr.get(i)+" ");


    }
}
