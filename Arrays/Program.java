public class Program {
    public static void main(String[] args) {
        String str="PROGRAM";
        char[] ch=str.toCharArray();
        int l=ch.length;
        int m;
        for(int i=0;i<l;i++) {
            m=l-i-1;
            for(int j=0;j<l;j++) {
                if( i==j || j==m){
                    System.out.print(ch[i]);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
