package lab2;
import java.util.Scanner;

public class Pro3 {
    public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in);
        
        String[]day = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday"};

        System.out.printf("Enter a year = ");
        int year = scan.nextInt();

        System.out.printf("Enter month = ");
        int m = scan.nextInt();

        System.out.printf("Enter day = ");
        int q = scan.nextInt();

        if(m == 1 || m == 2) {
            m += 12;
            year--; 
        }

        int k = year%100;
        int j = year/100;

        int h = (q + ((26*(m+1))/10) + (k/4) + (j/4) + (5*j))%7;
        
        System.out.printf(day[h]);

    }
}
