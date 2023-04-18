import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Ask user to input two numbers
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();
    
    // Ask user to input a string
    System.out.print("Choose an operation: +, -, *, or /: ");
    String inputString = scanner.next();
    
    int sum;
    switch (inputString) {
      case "+" -> {
        sum = num1 + num2;
        System.out.println("The answer is: " + sum);
      }
      case "-" -> {
        sum = num1 - num2;
        System.out.println("The answer is: " + sum);
      }
      case "*" -> {
        sum = num1 * num2;
        System.out.println("The answer is: " + sum);
      }
      case "/" -> {
        sum = num1 / num2;
        System.out.println("The answer is: " + sum);
      }
      default -> System.out.println("Invalid input");
    }

//        second challenge
    
    Random random = new Random();
    // generate a random integer between 1 and 10 (inclusive)
    int randomNumber = random.nextInt(101);
    // print the random number
    System.out.println("Random number: " + randomNumber);
    
    
    
    // Ask user to input number
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter the guess number: ");
//    int guessNumber = scanner.nextInt();
//    int numberOfTurns = 0;
//
//    do {
//      if (guessNumber > randomNumber){
//        System.out.println("The number is smaller than this!");
//        System.out.print("Enter the guess number: ");
//        guessNumber = scanner.nextInt();
//        numberOfTurns += 1;
//      } else if (guessNumber < randomNumber) {
//        System.out.println("The number is greater than this!");
//        System.out.print("Enter the guess number: ");
//        guessNumber = scanner.nextInt();
//        numberOfTurns += 1;
//      }
//    } while (guessNumber != randomNumber);
//    System.out.println("The number of turns it took for you to guess : "+ numberOfTurns);
  }
}



