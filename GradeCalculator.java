import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your Roll No: ");
            int rollNo = scanner.nextInt();

            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine();  

            String[] subjectNames = new String[numSubjects];
            int[] subjectMarks = new int[numSubjects];

            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter the name of subject " + (i + 1) + ": ");
                subjectNames[i] = scanner.nextLine();

                System.out.print("Enter the marks for " + subjectNames[i] + ": ");
                subjectMarks[i] = scanner.nextInt();
                scanner.nextLine(); 
            }

            int totalMarks = 0;
            for (int marks : subjectMarks) {
                totalMarks += marks;
            }
            System.out.println("Total mark: " + totalMarks);
            double average = ((double) totalMarks / (numSubjects * 100)) * 100;
            System.out.printf("Average Percentage: %.2f%n", average);
            if (average >= 90) {
                System.out.println("Your Grade: A");
            } else if (average >= 80) {
                System.out.println("Your Grade: B");
            } else if (average >= 70) {
                System.out.println("Your Grade: C");
            } else if (average >= 40) {
                System.out.println("Your Grade: D");
            } else {
                System.out.println("Your Grade: F");
            }
        }
    }
}
