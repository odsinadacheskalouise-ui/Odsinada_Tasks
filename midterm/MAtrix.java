import java.util.Scanner;
public class MAtrix{
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);
 
    char choice;
 
    do {
        //Declares and initialize the 2d array
        int[][] matrix = new int[3][3];
 
        System.out.println("Input 9 elements:");
 
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = input.nextInt();
            }
        }
 
        System.out.println("\nDisplay Here are the Numbers and the required outputs:\n");
        System.out.println("========================================================");
       //Display the Row Sum
        System.out.println("\t\t\t\tRow Sum:");
 
        for (int r = 0; r < 3; r++) {
 
            int rowSum = 0;
            System.out.print("\t   ");
 
            for (int c = 0; c < 3; c++) {
 
                System.out.printf("%5d", matrix[r][c]);
 
                rowSum += matrix[r][c];
            }
 
            System.out.printf("%10d%n", rowSum);
        }
 
        //Display the Column Sum
        System.out.print("Column Sum:");
 
        for (int c = 0; c < 3; c++) {
 
            int columnSum = 0;
 
            for (int r = 0; r < 3; r++) {
                columnSum += matrix[r][c];
            }
 
            System.out.printf("%5d", columnSum);
        }

        //Display the Diagonal Sum
        System.out.println();
        int dia1 = 0, dia2 = 0;
        for(int d=0; d < matrix.length; d++){
            dia1 += matrix[d][d];
            dia2 += matrix[d][matrix.length - 1 - d];
        }
        System.out.println("\nDiagonal sum 1: " + dia1);
        System.out.println("Diagonal sum 2: " + dia2);
 
        System.out.println();
        System.out.println("=========================================================");
 
        //the try again prompt
        System.out.print("\n\nTry Again [y/n]: ");
 
        choice = input.next().charAt(0);
 
    } while (choice == 'y');
 
    input.close();
}
 
}
