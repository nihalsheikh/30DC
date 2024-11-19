package apna.practice.problems.questionsOfVariableModules;
import java.util.*;

public class avgOfNum {

    public static void main(String[] args) {
        // Question 1: Average of Numbers
        Scanner sc = new Scanner(System.in);

        // Take input
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        // Calculate Average
        double avg = (num1 + num2 + num3) / 3;

        // close Scanner object
        sc.close();

        // Print output
        System.out.println("Average of Nums is: " + avg);
    }
}
