import java.util.Scanner;

public class Admission {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Accepting paper marks
        System.out.print("Enter marks for paper 1: ");
        int paper1 = input.nextInt();
        
        System.out.print("Enter marks for paper 2: ");
        int paper2 = input.nextInt();
        
        System.out.print("Enter marks for paper 3: ");
        int paper3 = input.nextInt();
        
        // Calculating total marks and percentage
        int totalMarks = paper1 + paper2 + paper3;
        double percentage = (totalMarks / 3.0);
        
        // Checking eligibility for admission
        System.out.print("Enter gender (M/F): ");
        String gender = input.next();
        
        if (percentage >= 62 && gender.equalsIgnoreCase("F")) {
            System.out.println("Congratulations! You are eligible for admission.");
        } else {
            System.out.println("Sorry, you are not eligible for admission.");
        }
        
        input.close();
    }

}
