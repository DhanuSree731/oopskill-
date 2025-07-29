package oop_skill;
import java.util.Scanner;
public class Perfectnum {
public static void main(String args[]) {
	int num,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a num ");
	num = sc.nextInt();
	for(int i = 1; i < num ; i++) {
		if(num % i == 0) {
			sum = sum + i;
			
		}
	}
	if(num == sum) {
		System.out.println(num + " is a perfect num");
		}
	else {
		System.out.println(num + " is not a perfect num");
	}
}
}
