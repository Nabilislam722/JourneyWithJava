import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static int findHighestNumber(int[] numbers) {
        if (numbers.length != 5) {
            throw new IllegalArgumentException("The array must contain exactly 5 numbers.");
        }

        int highest = numbers[0]; // Initialize the highest number with the first number

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i]; // Update the highest number if a larger number is found
            }
        }

        return highest;
    }

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        while (numberList.size() < 5) {
            if (scanner.hasNextInt()) {
                numberList.add(scanner.nextInt());
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        int[] numbersArray = new int[numberList.size()];
        for (int i = 0; i < numberList.size(); i++) {
            numbersArray[i] = numberList.get(i);
        }

        int highestNumber = findHighestNumber(numbersArray);
        System.out.println("The highest number is: " + highestNumber);
    }
}
