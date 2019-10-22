import java.util.Scanner;

public class InputOutputChange {
    public static void main(String[] args){
        double x, y,z;
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Enter the first number:");
        x=keyboard.nextDouble();

        System.out.println("Enter the second number:");
        y=keyboard.nextDouble();

        z= (x+y)/2;
        System.out.println("The average of both the numbers is: " +z);

    }
}
