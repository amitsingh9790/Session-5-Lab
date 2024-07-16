import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        //Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        //Initialize counter for odd and even numbers
        int countOdd = 0, countEven = 0;

        System.out.println("Enter numbers (enter -1 to exit):");
        // Taking first number input by the user
        int number = sc.nextInt();

        // Continue the loop until -1 is entered
        while (number != -1){
            //if the number is even, increment even counter
            // else increment odd counter
            if(number %2 == 0)
                ++countEven;
            else
                ++countOdd;
            // Taking next number input by the user
            number = sc.nextInt();
        }

        System.out.println("Total Even numbers: "+countEven);
        System.out.println("Total Odd numbers: "+countOdd);

        sc.close();
    }
}
