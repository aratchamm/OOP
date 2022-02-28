package lab2;
import java.util.Scanner;

public class Pro5 {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.printf("Enter the number of lines: ");
        int line = scan.nextInt();

        for(int c = 1; c<= line; c++) {
            for(int s=line-c;s>=1; s--) {
                System.out.print("  ");
            }
            for(int j=c; j>= 2; j--) {
                System.out.print(j+" ");
            }
            for(int r=1; r<=c; r++) {
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }
}
