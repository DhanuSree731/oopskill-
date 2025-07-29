package oop_skill;
import java.util.Scanner;
public class Temp {
	public static void main(String args[]) {
		float fahrenheit,celsius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp in Fahrenheit: ");
		fahrenheit = sc.nextFloat();
		celsius = (fahrenheit-32)*5/9;
		System.out.println(celsius + " is celsius");
	}
}
