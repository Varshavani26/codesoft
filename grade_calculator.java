import java.util.*;
import java.util.Scanner;
public class grade_calculator {

    public static void main(String [] args)
    {
        int i;
        int sum=0;
      

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of subjects to calculate : ");

        int no_of_subjects = sc.nextInt();

        int marks[] = new int[no_of_subjects];

        for(i=0;i<no_of_subjects;i++)
        {
            System.out.println("Enter the marks of "+(i+1)+"subjects:");
            marks[i] = sc.nextInt();
            sum+=marks[i];
           
            
        }
        // double average =  (sum*100)/(no_of_subjects*100);
        // double average = (int) sum/no_of_subjects;
        double average = (double) sum / no_of_subjects;
    int average1 = (int) average; // Rounds down to the nearest integer

        

        System.out.println("Total Marks: " + sum);
        System.out.println("Average Percentage: " + average1 + "%");

        String grade = calculateGrade(average1);
        System.out.println("Grade: " + grade);
        sc.close();
    }

    public static String calculateGrade(double percentage)
    {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    
}
