import java.util.Arrays;
public class Move_zeros {
    public static void main(String[] args) {
        int[] n = {0,2,0,1,9};
        int len = n.length;
        int index=0;
        for(int i=0;i<=len-1;i++){
            if(n[i]!=0){
                n[index++]=n[i];
            }
        }
        while(index<len){
            n[index++]=0;
        }
        System.out.println(Arrays.toString(n));
       
    }
}
