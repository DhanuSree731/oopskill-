package oop_skill;
import java.util.Scanner;
public class Vowel_Consonant {
public static void main(String[] args) {
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character :");
	ch = sc.next().charAt(0);
	if((ch >= 'A' && ch >= 'Z') || (ch >= 'a' && ch >= 'z')) {
		//if((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
			System.out.println(ch + " is a vowel");
		}else {
			System.out.println(ch + " is a consonant");
		//}
	}
}
}
