package lab1;
import java.util.Scanner;

public class Pro3_64010994 {
    public static void main(String[] args) {

    System.out.printf("Enter a number between 0 and 1000: ");
    Scanner digits = new Scanner(System.in);
    int num    =  digits.nextInt();
    digits.close(); 
    System.out.printf("The sum of the digits is ");
    System.out.println((num%10)+(num%100/10)+num/100);
}}