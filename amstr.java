public class amstr {
    public static void main(String[] args) {
        int n = 153;
        int s = 0;
        int i = 0;
        int temp =n;
        while(i!=n){
            int r = n%10;
            s+=Math.pow(r,3);
            n=n/10;
        }
        if(temp==s){
            System.out.println("Yes");
        }
        else{
        System.out.print("no");

    }
}
}
