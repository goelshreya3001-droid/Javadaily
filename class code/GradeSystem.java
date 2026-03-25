import java.util.*;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class GradeSystem {

    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100)
            throw new InvalidMarksException("Invalid Marks");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int total = 0;

        try {

            for (int i = 0; i < 5; i++) {
                marks[i] = sc.nextInt();
                checkMarks(marks[i]);
                total += marks[i];
            }

            double percentage = total / 5.0;

            if (percentage > 90)
                System.out.println("Grade A+");
            else if (percentage >= 80)
                System.out.println("Grade A");
            else if (percentage >= 60)
                System.out.println("Grade B");
            else if (percentage >= 40)
                System.out.println("Grade C");
            else
                System.out.println("Fail");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}