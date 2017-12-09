import java.util.Scanner;

public class CarDriver {

    public static void main(String [] args) {

        // Create a scanner object
        Scanner keyboard = new Scanner(System.in);

        // Give prompt
        System.out.println("Enter some numbers that are going to be calculated for some ways(Seperate by ',')");

        // Create a calculator object
        Calculator calculator = new Calculator();
        String input = keyboard.nextLine();
        // Create our array
        String nums[];



        // Create seperation thing
        nums = input.split( ",");



        // Create doubles that are going to be calculated
        double a = calculator.findSum(nums);
        double b = calculator.findAverage(nums);
        double c = calculator.findProduct(nums);
        double d = calculator.findFactorial(nums);



        // Give all of the results
        System.out.println("The sum of the numbers you have entered is " + a);
        System.out.println("The average of the numbers you have entered is " + b);
        System.out.println("The product of the numbers you have entered is " + c);
        System.out.println("The factorials of the numbers you have entered is " + d);

    }
}
