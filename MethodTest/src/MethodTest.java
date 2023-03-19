import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodTest
{
    public static void main(String[] args)
    {
        //Declaring variables
        int tempGrade;
        String letterGrades1;
        String letterGrades2;
        String letterGrades3;
        String letterGrades4;
        String letterGrades5;

        //Creating Scanner for keyboard
        Scanner keyboard = new Scanner(System.in);
        //Setting up decimal format
        DecimalFormat formatter = new DecimalFormat("#0.00");

        //Getting the grades of all 5 students
        System.out.print("Enter test grade for student 1:");
        int student1 = keyboard.nextInt();
        System.out.print(" Enter test grade for student 2:");
        int student2 = keyboard.nextInt();
        System.out.print(" Enter test grade for student 3:");
        int student3 = keyboard.nextInt();
        System.out.print(" Enter test grade for student 4:");
        int student4 = keyboard.nextInt();
        System.out.print(" Enter test grade for student 5:");
        int student5 = keyboard.nextInt();

        //Adding all grades and sending it to the calcAverage method to get the average
        int gradeTotal = student1 + student2 + student3 + student4 + student5;
        double gradeAverage = calcAverage(gradeTotal);


        //Calling determineGrade to get letter grade for each score
        tempGrade = student1;
        letterGrades1 = determineGrade(tempGrade);
        tempGrade = student2;
        letterGrades2 = determineGrade(tempGrade);
        tempGrade = student3;
        letterGrades3 = determineGrade(tempGrade);
        tempGrade = student4;
        letterGrades4 = determineGrade(tempGrade);
        tempGrade = student5;
        letterGrades5 = determineGrade(tempGrade);

        //Final output stating letter grade and average. Average is formatted to the second decimal place.
        System.out.print(" The letter grades are as follows:\n" +
                "Student 1: " + letterGrades1 + "\n" +
                "Student 2: " + letterGrades2 + "\n" +
                "Student 3: " + letterGrades3 + "\n" +
                "Student 4: " + letterGrades4 + "\n" +
                "Student 5: " + letterGrades5 + "\n");
        System.out.print("The average grade was: " + formatter.format(gradeAverage));



    }
    //Method to get average
    public static double calcAverage(double gradeTotal)
    {
        //Getting average for all grades combined
        return gradeTotal / 5;
    }
    //Method to get letter grade
    public static String determineGrade(int tempGrade)
    {

        if (tempGrade >= 90)
        {
            return "A";
        }
        else if (tempGrade >= 80)
        {
            return "B";
        }
        else if (tempGrade >= 70)
        {
            return "C";
        }
        else if (tempGrade >= 60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
}