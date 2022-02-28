package lab3;

public class pro1
{
    public static boolean isPrime(int n) {
        int c = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        
        boolean prime = c == 2;
        return prime;
    }

    public static boolean isPalindrome(int n) {
        int num = n, revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            revNum = revNum * 10 + digit;
        }

        boolean palin = revNum == n;
        return palin;
    }

    public static void main(String args[]) {
        int x = 1, count = 0;
        int p =0;
        while (count < 100) {
            if (isPrime(x) && isPalindrome(x)) {
                count++;
                System.out.print(x + " ");
                p++;
                if(p==10) {
                    System.out.println();
                    p=0;
                }
            }
            x++;
        }
    }
}