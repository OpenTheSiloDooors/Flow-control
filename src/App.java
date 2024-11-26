public class App {
    public static void main(String[] args) {
    
    // Initialize array
    int[] arrayNums;
    arrayNums = new int[100]; // Creating an array of 100 integers

    for (int x = 0; x < arrayNums.length; x++) {
    arrayNums[x]=x+1;

    }
    // Loop from 1 to 100
    for (int x = 0; x < arrayNums.length; x++) {
    
    // Check if the number is even
    if (arrayNums[x] % 2 == 0) {
        
        // If it's even, print even
        System.out.println(arrayNums[x] + " is Even");
        } 
        
        else

        // If it's not even, print odd
        System.out.println(arrayNums[x] + " is Odd");
        }
    }
}
