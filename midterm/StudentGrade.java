import java.util.Scanner;

public class StudentGrade {

   public static void main(String[] args) {

       int[][][] grades = new int[2][3][3];

       Scanner input = new Scanner(System.in);

           String[] subjects = {"Java", "Database", "Networking"};

           for (int section = 0; section < grades.length; section++) {

               System.out.println("\nSECTION " + (section + 1));
               System.out.println("--------------------");

               for (int student = 0; student < grades[section].length; student++) {

                   System.out.println("\nStudent " + (student + 1));

                   for (int subs = 0; subs < grades[section][student].length; subs++) {

                       System.out.print(subjects[subs] + ": ");

                       grades[section][student][subs] = input.nextInt();

                   }

                   int studentTotal = 0;

                   for (int subs = 0; subs < grades[section][student].length; subs++) {

                       studentTotal += grades[section][student][subs];

                   }

                   double studentAvg = studentTotal / 3.0;

                   System.out.printf("Student Average: %.2f%n", studentAvg);

               }

               int sectionTotal = 0;

               for (int student = 0; student < grades[section].length; student++) {

                   for (int subs = 0; subs < grades[section][student].length; subs++) {

                       sectionTotal += grades[section][student][subs];

                   }

               }

               double sectionAvg = sectionTotal / 9.0;

               System.out.printf("%nSection Average: %.2f%n", sectionAvg);

           }

       input.close();
   }

}
 