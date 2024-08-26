import java.util.Scanner;
public class Task2_StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("\n\t_____Student Grade Calculator_____\n");
        System.out.println("Note:- Marks Evaluation = 0 to 100");
        
        int[] marksList = new int[5];

//Taking input of Marks of the Student

        Scanner marks = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("\nEnter the marks of Subject " + (i + 1) + " = ");
                marksList[i] = marks.nextInt();
            } while (marksList[i] < 0 || marksList[i] > 100);
        }
        int totalSubject = 5;
        int totalMarks = 500;

//Sum of all Marks Obtained by the Student in Exams

        int obtained = 0;
        for (int i = 0; i < 5; i++) {
            obtained += marksList[i];
        }
        System.out.println("\nTotal Marks Obtained by the Student = " + obtained);
        
//Calculating Average Percentage of the marks obtained by the Student

        double average = obtained / (double)totalSubject;
        int passingGrade = 33;
    if (average < passingGrade) {
        System.out.println("\nResult = Fail.\n\n");
    }
    else{
        System.out.println("\nResult = Pass.\n\n");
    }

//Printing the Values/Details of Marking

        System.out.println("Total Subjects = " + totalSubject);
        System.out.println("Total Marks = " + totalMarks + "|| \tMarks Obtained = " + obtained);
        System.out.println("Percentage = " + average + "%");

        System.out.println("\nIf any inconvenience happens kindly contact the Institute as soon as Possible.\n\n\t_____Best Wishes for your Future_____");

    }

}
