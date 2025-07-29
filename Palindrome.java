package oop_skill;
import java.util.Scanner;
public class Palindrome {
public static void main(String args[]) {
	int num, reversed = 0, original, remainder;
	Scanner sc = new Scanner(System.in);
System.out.println("Enter a num: ");
num = sc.nextInt();
original = num;
while(num!=0) {
	remainder = num % 10;
	reversed = reversed * 10 + remainder;
	num /= 10;
}
if(original==reversed) {
	System.out.println(original + " is a palindrome num");
}
else {
	System.out.println(original + " is a not palindrome num");
}
}
}