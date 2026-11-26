import java.util.Scanner;
public class StudentGradeMan {

    //average method
    public static int getAverage(int Grade1, int Grade2, int Grade3) {
        return (Grade1 + Grade2 + Grade3) / 3;
    }
    //remarks method
    public static String getRemark(double remarks){
        
        if (remarks >= 60) {
            return "Passed";
        } else {
            return "Failed";
        }

    }
    //display result method
    public static void displayResult(double average, String remarks) {
       System.out.printf("\nAverage is\t\t: %.2f%n", average);
        System.out.println("Remarks \t\t:" + remarks);
    }
    //display student info method
    public static void studInfo(String StudentNumber, String StudentName, String Course, String YearLevel){
    System.out.println("Student Number: " + StudentNumber);
       System.out.println("Student Name\t: " + StudentName);
       System.out.println("Course\t:" + Course);
       System.out.println("Year Level\t:" + YearLevel);
    }
    //equivalent grade method
    public static String getEquiv(double getAverage, char option){
        
        String equiv = "";
       switch(option){
           case 'L':
               if(getAverage >= 90) equiv = "A";
               else if(getAverage >= 83) equiv = "B";
               else if(getAverage >= 75) equiv = "C";
               else if(getAverage >= 60) equiv = "D";
               else equiv = "F";
               break;
           case 'N':
               if(getAverage >= 96) equiv = "4.00";
               else if(getAverage >= 90) equiv = "3.50";
               else if(getAverage >= 84) equiv = "3.00";
               else if(getAverage >= 77) equiv = "2.50";
               else if(getAverage >= 70) equiv = "2.00";
               else equiv = "1.00";
               break;
       }
       return equiv;
    }

    //main method
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
 
        System.out.println("-----------------------------------");
        System.out.println("Sample Output: ");
        System.out.println("-----------------------------------");
         
        //input student info
        System.out.print("Student Number\t\t:");
        String StudentNumber = in.nextLine();
        System.out.print("Student Name \t\t:");
        String StudentName = in.nextLine();
        System.out.print("Course \t\t\t:");
        String Course = in.nextLine();
        System.out.print("Year Level \t\t:");
        String YearLevel = in.nextLine();

        //input grades
        System.out.print("-----------------------------------");
        System.out.println("\nEnter Grades:");
        System.out.print("Grade 1 \t\t:");
        int Grade1 = in.nextInt();
        System.out.print("Grade 2 \t\t:");  
        int Grade2 = in.nextInt();
        System.out.print("Grade 3 \t\t:");
        int Grade3 = in.nextInt();
        
        System.out.println("-----------------------------------");
        System.out.print("Display Letter Grade or Numeric Grade [L/N]? ");
       char option = in.next().toUpperCase().charAt(0);
       String equivalentGrade = getEquiv(getAverage(Grade1, Grade2, Grade3), option);
        
       
       System.out.println("-----------------------------------");
        System.out.println("Student Details: " + StudentNumber +  " " + Course + " " + YearLevel);
        System.out.println("Full Name: " + StudentName);
        
    
      System.out.println("-----------------------------------");
      double average = getAverage(Grade1, Grade2, Grade3);
      String remarks = getRemark(average);  
       
       System.out.printf("Average is\t: %.2f\n", average);
      if(option == 'L'){
           System.out.println("Letter Grade is\t: " + equivalentGrade);
       }else{
           System.out.println("Numeric Grade\t: " + equivalentGrade);
       }
        System.out.println("Remarks\t\t: " + remarks);
        System.out.println("-----------------------------------");

    }

}
