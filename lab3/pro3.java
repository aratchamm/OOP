package lab3;
import java.util.Scanner;


public class pro3 {
  
   public static void rowChecks(int[][] array){
       int flag = 0;
       for(int i = 0; i < array.length; ++i){
           if(checkRowForSameness(array, i) == 1){
               flag = 1;
           }
       }
       if(flag == 0){
           System.out.println("No same numbers on a row");
       }
   }
   public static void columnChecks(int[][] array){
       int flag = 0;
       for(int i = 0; i < array[0].length; ++i){
           if(checkColumnForSameness(array, i) == 1){
               flag = 1;
           }
       }
       if(flag == 0){
           System.out.println("No same numbers on a column");
       }
   }
   public static void printTwoDArray(int[][] array){
       for(int i = 0; i < array.length; ++i){
           for(int j = 0; j < array[0].length; ++j){
               System.out.print(array[i][j]);
           }
           System.out.println();
       }
   }
   public static int[][] randomZeroOneMatrix(int n){
       int[][] array = new int[n][n];
       for(int i = 0; i < array.length; ++i){
           for(int j = 0; j < array[0].length; ++j){
               array[i][j] = (int) (Math.random() * 2.0);
           }
       }
       return array;
   }
   public static int checkRowForSameness(int[][] matrix, int i){
       int flag = 1;
       for(int j = 0; j < matrix[i].length - 1; ++j){
           if(matrix[i][j] != matrix[i][j + 1]){
               flag = 0;
               break;
           }
       }
       if(flag == 1){
           if(matrix[i][0] == 0){
               System.out.println("All 0's on row " + i);
           }
           else{
               System.out.println("All 1's on row " + i);
           }
           return 1;
       }
       else{
           return 0;
       }
   }
   public static int checkColumnForSameness(int[][] matrix, int j){
       int flag = 1;
       for(int i = 0; i < matrix.length - 1; ++i){
           if(matrix[i][j] != matrix[i + 1][j]){
               flag = 0;
               break;
           }
       }
       if(flag == 1){
           if(matrix[j][0] == 0){
               System.out.println("All 0's on column " + j);
           }
           else{
               System.out.println("All 1's on column " + j);
           }
           return 1;
       }
       else{
           return 0;
       }
   }

   public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the size of the matrix: ");
       int n = in.nextInt();
       int array[][] = randomZeroOneMatrix(n);
       printTwoDArray(array);
       rowChecks(array);
       columnChecks(array);
   }
}