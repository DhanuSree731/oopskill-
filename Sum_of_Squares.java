package oop_skill;
import java.util.Scanner;
public class Sum_of_Squares {
public static void main(String args[]){
int num,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a num ");
num = sc.nextInt();
for (int i = 0 ; i<= num ; i++) {
	sum += i * i;
}
System.out.println("sum of squares from 1 to "+ num + " is: " + sum);

}
}