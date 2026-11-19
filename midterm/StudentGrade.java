import java.util.Scanner;

public class StudentGrade {

   public static void main(String[] args) {

       int[][][] grades = new int[2][3][3];

       Scanner input = new Scanner(System.in);

           String[] subjects = {"Java", "Database", "Networking"};

           for (int s = 0; s < grades.length; s++) {

               System.out.println("\nSECTION " + (s + 1));
               System.out.println("--------------------");

               for (int st = 0; st < grades[s].length; st++) {

                   System.out.println("\nStudent " + (st + 1));

                   for (int sub = 0; sub < grades[s][st].length; sub++) {

                       System.out.print(subjects[sub] + ": ");

                       grades[s][st][sub] = input.nextInt();

                   }

                   int studentTotal = 0;

                   for (int sub = 0; sub < grades[s][st].length; sub++) {

                       studentTotal += grades[s][st][sub];

                   }

                   double studentAvg = studentTotal / 3.0;

                   System.out.printf("Student Average: %.2f%n", studentAvg);

               }

               int sectionTotal = 0;

               for (int st = 0; st < grades[s].length; st++) {

                   for (int sub = 0; sub < grades[s][st].length; sub++) {

                       sectionTotal += grades[s][st][sub];

                   }

               }

               double sectionAvg = sectionTotal / 9.0;

               System.out.printf("%nSection Average: %.2f%n", sectionAvg);

           }

       input.close();
   }

}
 