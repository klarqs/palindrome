import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.print("Enter a group of integer values: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int tempNumber = number;
        int result = 0;
        int remainder;
        while (tempNumber > 0) {
            remainder = tempNumber % 10;
            result = result * 10 + remainder;
            tempNumber = tempNumber / 10;
        }
        if (number == result)
            System.out.println("This is a Palindrome");
        else
            System.out.println("This is not a Palindrome");
    }
}

