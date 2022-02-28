package lab1;
import java.util.Scanner;

public class Pro4_64010994 {
    public static void main(String[] args) {
        double bmi;

        System.out.printf("Enter weight in pounds: ");
        Scanner weightScan  = new Scanner(System.in);   
        double weight    =  weightScan.nextDouble();

        System.out.printf("Enter height in inches: ");
        Scanner heightScan  = new Scanner(System.in);
        double height    =  heightScan.nextDouble(); 

        weight = weight * 0.45359237;
        height = height * 0.0254;
        bmi = weight/(height*height);
        
        heightScan.close(); 
        weightScan.close(); 
        System.out.printf("BMI is ");
        System.out.printf("%.4f",bmi);
    }
}
