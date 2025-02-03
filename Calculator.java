import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
System.out.println("Press the number 1 for addition");
System.out.println("Press the number 2 for subtraction");
System.out.println("Press the number 3 for multiplication");
System.out.println("Press the number 4 for division");
int ch = sc.nextInt();
if(ch == 1){
System.out.println("Enter the first number:");
double n1 = sc.nextDouble();
System.out.println("Enter the second number:");
double n2 = sc.nextDouble();
double r = n1 +  n2;
System.out.println("Result:" + r);
}
else if(ch == 2){
System.out.println("Enter the first number:");
double n3 = sc.nextDouble();
System.out.println("Enter the second number:");
double n4 = sc.nextDouble();
double r = n3 -  n4;
System.out.println("Result:" + r);
}
else if(ch == 3){
System.out.println("Enter the first number:");
double n5 = sc.nextDouble();
System.out.println("Enter the second number:");
double n6 = sc.nextDouble();
double r = n5 * n6;
System.out.println("Result:" + r);
}
else if(ch == 4){
System.out.println("Enter the first number:");
double n7 = sc.nextDouble();
System.out.println("Enter the second number:");
double n8 = sc.nextDouble();
double r = n7/n8;
System.out.println("Result:" + r);
}
else{
System.out.println("Pls press the number between 1 to 4");
}
}
}

