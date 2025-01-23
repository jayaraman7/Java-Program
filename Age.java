import java.util.Scanner;
public class Age {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
System.out.print("Enter your age:");
int n = sc.nextInt();
if( n<=0 && n<=12){
System.out.println("You are a Child");
}
else if(n>=13 && n<=19){
System.out.println("You are a Teenage ");
}
else if(n>=20 && n<=64){
System.out.println("You are an Adult");
}
else{
System.out.println("You are a Senior Citizen");
}
}
}
