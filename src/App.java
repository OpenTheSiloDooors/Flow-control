public class App {
    public static void main(String[] args) {
    int sum = 0;
    
    // Loop from 1 to 100
    for (int i = 1; i <= 100; i++) {
        sum += i;

    
    
    // If the number is even, print even
    if (i % 2 == 0) {
        
        System.out.println(i + " is even");
        } else

        // If it's not even, print odd
        System.out.println(i + " is odd");

    // Add all numbers
    System.out.println("The sum is " +sum);
        }
    }
}