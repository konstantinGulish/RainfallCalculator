import java.util.Scanner;
public class RainfallCalculator {
    public static void main (String [] args) {
        final int INCHES_PER_FOOT = 12;
        final int CUBIC_INCHES_PER_GALLON = 231;
        Scanner in = new Scanner (System.in);
        double length, width, rainfall, runoff;

        //Prompt for information
        System.out.print("Enter roof length (in feet): ");
        length = in.nextDouble();
        System.out.print("Enter roof width (in feet): ");
        width = in.nextDouble();
        System.out.print("Enter rainfall amount (in inches): ");
        rainfall = in.nextDouble();

        //convert feet to inches
        length *= INCHES_PER_FOOT;
        width *= INCHES_PER_FOOT;

        //calculate runoff in cubic inches
        runoff = length * width * rainfall;

        //calculate runoff in gallons
        runoff /= CUBIC_INCHES_PER_GALLON;

        //display result
        System.out.printf("The roof runoff is %.2f gallons", runoff);
    }
}
