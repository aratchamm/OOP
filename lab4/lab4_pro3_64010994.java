package lab4;

public class lab4_pro3_64010994{
    public static void selectionSort(double[] num){
        for(int i=0;i<num.length-1;i++){
            int in=i;
            for(int j=i+1;j<num.length;j++){
                if(num[j]<num[in]){
                    in = j;
                }
            }

            if(in!=i){
                double tmp = num[in];
                num[in] = num[i];
                num[i] = tmp;
            }
        }
    }
    public static boolean isPalinDrome(int n){
        int sum=0;
        int a=n;
        while(a>0){
            sum = sum*10+a%10;
            a/=10;
        }
        return n==sum;
    }
    public static boolean isPrimeNumber(int n){
        for(int i = 2; i*i <=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int p = 0;
        StopWatch clock = new StopWatch();
        System.out.println("Creating a list containing 1000 elements,");
        double[] num = new double[1000];
        for(int i=0; i<num.length; i++){
            num[i] = Math.random()*1000;
            if(p!=0)System.out.print("\t\t");
            System.out.printf("%.2f",num[i]);
            p++;
            if((i+1)%10==0) {
                System.out.println();
                p=0;
            }
        }
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        clock.start();
        selectionSort(num);
        for(int i=0; i<num.length; i++){
            if(p!=0)System.out.print("\t\t");
            System.out.printf("%.2f",num[i]);
            p++;
            if((i+1)%10==0) {
                System.out.println();
                p=0;
            }
        }
        clock.stop();
        System.out.println("Sorting stopwatch stoped.");
        System.out.println("The sort time is "+clock.getElapsedTime()+" milliseconds.");
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        clock.start();
        System.out.println("Creating 100 PalindromPrime...");
        int n = 0;
        int i = 2;
        while(n<100){
            if(isPalinDrome(i)){
                if(isPrimeNumber(i)){
                    System.out.print(i+"\t\t");
                    n++;
                    if(n%10==0&&n>0)System.out.println();
                }
            }
            i++;
        }
        System.out.println("PalindromePrime created.");
        clock.stop();
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is "+clock.getElapsedTime()+" milliseconds.");
    }
}