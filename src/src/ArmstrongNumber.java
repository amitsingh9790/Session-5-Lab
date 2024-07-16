import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of range: ");
        int start = sc.nextInt();
        System.out.println("Enter the end of range: ");
        int end = sc.nextInt();

        printArmstrongNumber(start,end);
    }

    //Method to print armstrong number within given range
    public static void printArmstrongNumber(int start, int end) {
        for (int i = start; i < end ; i++) {
            if(isArmstrong(i))
                System.out.print(i+" ");
        }
    }

    //Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num){
        int originalNum = num, rem = 0, digitCubeSum = 0;
        while (num!=0){
            rem = num % 10;
            num = num/10;
            digitCubeSum += cube(rem);
        }
        if(digitCubeSum == originalNum)
            return true;
        else
            return false;
    }

    //Method to calculate the cube of a number
    public static int cube(int number) {
        return number*number*number;
    }
}
