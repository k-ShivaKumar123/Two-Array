import java.util.*;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row value:");
        int rows = sc.nextInt();
        System.out.println("enter cols value:");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        System.out.println("enter the values into the matrix:");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
                }
        }

        System.out.println("your matrix is :");
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){

        System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
    }
        
    }
}

