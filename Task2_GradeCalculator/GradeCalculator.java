import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int total = 0;
        int i=1;
         char grade;
        for (i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            if(marks<40)
            {
              grade='F';
              break;
            }
            total += marks;
        }

        double average = total / (double) n;
       
        if(i<n)
          grade='F';
      else{
        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 50) grade = 'D';
        else grade = 'F';
      }

        
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
