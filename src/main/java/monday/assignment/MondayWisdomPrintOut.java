package monday.assignment;


import java.util.Scanner;

public class MondayWisdomPrintOut {

    public static void main(String[] args) {


    System.out.println("enter word:  ");
    Scanner scanner = new Scanner(System.in);
    MondayWisdomAssignment assignment1 = new MondayWisdomAssignment();
    String userInput = scanner.next();
        assignment1.typeToUpperCase(userInput);
        System.out.println(assignment1.reverse(userInput));
        assignment1.vowelCount(userInput);
        System.out.println(assignment1.isPalindrome(userInput));
}


}
