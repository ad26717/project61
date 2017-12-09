public class Calculator {

    // Declare necessary doubles
    private double total;
    private double product;
    private double average;
    private double numbers;
    private double num1;
    private double num2;

    // Declare integers
    private int i;
    private int h;

    // Create a function that gives sum
    public static double findSum(double num1,double num2){
        return num1+num2;
    }

    // Create a function that gives sum
    public static double findSum(double [] numbers) {
        double total = 0;
        for (int i=0; i<numbers.length; i++) {
            total +=numbers[i];
        }
        return total;
    }

    // Create a function that gives sum
    public static double findSum(String [] numbers){
        double [] doubleNumbers = new double [numbers.length];
        for (int i=0; i<numbers.length; i++) {
            doubleNumbers[i] = Double.parseDouble(numbers[i]);
        }
        return findSum(doubleNumbers);

    }

    // Create a method that averages numbers in an array
    public static double findAverage(double [] numbers) {

        double average, sum= 0;
        for (int i =0; i<numbers.length; i++) {
            sum = sum + numbers[i];

        }
        average = sum/numbers.length;
        return average;
    }

    // Create a method that averages numbers in an array
    public static double findAverage(String [] numbers) {
        double [] doubleNumbers = new double [numbers.length];
        for (int i=0; i<numbers.length; i++) {
            doubleNumbers[i] = Double.parseDouble(numbers[i]);

        }
        return findAverage(doubleNumbers);

    }
    public static double findProduct(double num1, double num2) {
        return num1*num2;

    }
    public static double findProduct(double [] numbers){
        double product = 1;
        for (int i=0; i<numbers.length; i++){
            product =product*numbers[i];
        }
        return product;
    }
    public static double findProduct(String [] numbers ){
        double [] doubleNumbers = new double[numbers.length];
        for(int i=0; i<numbers.length; i++){
            doubleNumbers[i] = Double.parseDouble(numbers[i]);
        }
        return findProduct(doubleNumbers);
    }
    public double findFactorial(double num1) {
        double factorial = 1;
        for (int h = 1; h < num1; h++) {
            factorial = factorial * h;
        }
        return factorial;

    }

    public double findFactorial(double [] numbers) {
        double factorial =1;
        for (int i=0; i<numbers.length; i++){
            for (int h=2; h<=numbers[i]; h++) {
                factorial = factorial * h;
            }

        }
        return factorial;

    }
    public double findFactorial(String [] numbers ) {
        double [] doubleNumbers = new double [numbers.length];
        for (int i=0; i<numbers.length; i++){
            doubleNumbers[i] = Double.parseDouble(numbers[i]);

        }
        return findFactorial(doubleNumbers);

    }
}
