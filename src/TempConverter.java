import java.util.Scanner;
import java.lang.Math;
public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempCelsius = 0;
        double tempFahr = 0;
        boolean valid = false;
        boolean n = false;
        String yesOrNo = "";

        while (!n) {
            System.out.println("Please enter the value for Celsius that you would like to be converted to Fahrenheit.");

            do {
                if (scan.hasNextDouble()) {
                    tempCelsius = scan.nextDouble();

                    //To Clear Buffer
                    scan.nextLine();

                    tempFahr = (tempCelsius * (double)(9 / 5)) + 32;
                    System.out.printf("The Fahrenheit is : %.2f", tempFahr);
                    System.out.printf("\nThe Celsius is : %.2f", tempCelsius);

                    System.out.println("\nWould you like to add another temperature to be converted? Y/N.");
                    yesOrNo = scan.nextLine();
                    if (yesOrNo.equalsIgnoreCase("N")){
                        n = true;
                    }

                    valid = true;
                } else {
                    scan.nextLine();
                    System.out.println("You have entered an invalid temperature. Please try again.");
                    valid = false;
                }

            } while (!valid);

        }










    }
}