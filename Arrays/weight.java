
public class weight {
    public static void main(String[] args) {
        int[] arr={49,36,8,10,12};
        int[] a=new int[arr.length];
        int c;
        for(int i=0;i<arr.length;i++) {
            c=(int)Math.sqrt(arr[i]);
            if(arr[i]==c*c){
                a[i]+=5;
            }
            if(arr[i]%4==0&&arr[i]%6==0){
                a[i]+=4;
            }
            if(arr[i]%2==0){
                a[i]+=3;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int temp;
                if(a[i]<a[j]) {
                     temp=a[i];
                    int t=arr[i];
                    a[i]=a[j];
                    arr[i]=arr[j];
                    a[j]=temp;
                    arr[j]=t;
                }
                if (a[i] == a[i + 1]) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        }
        System.out.println();
        for(int i=0;i<a.length;i++)
            System.out.println("<"+arr[i]+","+a[i]+">");
    }
}
