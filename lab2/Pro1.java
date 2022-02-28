package lab2;
import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in);

        String[]day = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};

        System.out.printf("Enter today's day: ");
        int today    =  scan.nextInt();

        System.out.printf("Enter the number of days elapsed since today: ");  
        int num    =  scan.nextInt();

        int  dday = (today+num)%7;
        System.out.printf("Today is " + day[today] + " and the future day is " + day[dday]);


    }
}
