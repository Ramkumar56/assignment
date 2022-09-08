import java.util.Arrays;

public class array_sort {
    public static void main(String[] args) {
        int arr[] = {1,2,1,4,5,6,8,8};
        int a[] = new int[arr.length];
        int mid = (arr.length/2);
        Arrays.sort(arr);
        mid = (arr.length%2 == 0)? mid-1:mid;
        a[0] = arr[mid];
        int d=1;
        for (int i = 1; mid+i <arr.length; i++) {
            a[d++] = arr[mid+i];
            if(mid-i>=0)
                a[d++] = arr[mid-i];
        }
        System.out.println(Arrays.toString(a));
        }
    }

