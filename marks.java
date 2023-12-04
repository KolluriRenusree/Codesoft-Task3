import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming there are three subjects
        int numberOfSubjects = 3;
        int[] marks = new int[numberOfSubjects];

        // Input marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks (out of 100) for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Assign grades based on the average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
