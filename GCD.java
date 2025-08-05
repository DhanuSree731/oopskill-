package oop_skill;
import java.util.Scanner;
public class GCD {
public static void main(String args[]){
	int a,b,temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value ");
	a = sc.nextInt();
	System.out.println("Enter b value ");
	b = sc.nextInt();
	  int originalA = a;
      int originalB = b;
	
	while(b != 0) {
		temp = b;
		b = a % b;
		a = temp;
	}
	System.out.println("GCD of " + originalA + " and " + originalB + " is: " + a);
}
}