public class App {
    public static void main(String[] args) {
    //Created by Jacob Aaron Espinoza. Prints a loop from 1 to 100, declares whether they are even or odd, and adds all the numbers.
    
        int sum = 0; //initializing variable
    
    // Loop from 1 to 100
    for (int i = 1; i <= 100; i++) {
        sum += i; // add all the numbers

    // If the number is even, print even
    if (i % 2 == 0) {
        
        System.out.println(i + " is even");
        } else

        // If it's not even, print odd
        System.out.println(i + " is odd");

    // Print all numbers and sum of all numbers
    System.out.println("The sum is " +sum);
        }
    }
}
