public class ArrayEquals {
    public static void main(String[] args) {
        
   
    int[] a = {1, 2, 3, 5};
    int[] b = {1,2,3,5};

    if(a.length!=b.length){
        System.out.println("no");
    }
    boolean isequal = true;
    for(int i=0;i<a.length;i++){
        if(a[i]!=b[i]){
            isequal=false;
            break;
        }
    }
    if(isequal){
        System.out.println("Yes");
    }
    else{
        System.out.println("no");
    }

}
}
