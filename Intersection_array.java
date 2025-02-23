public class Intersection_array {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] b = {2,3,4};
        int len1=a.length;
        int len2=b.length;
        for(int i=0;i<=len1-1;i++){
            for(int j=0;j<=len2-1;j++){
                if(a[i]==b[j]){
                    System.out.print(" "+b[j]);
                    break;
                }
            }
        }
    }
}
