import java.util.Scanner;

public class Main {
	
    public static void Calculate_circle(double radius) {
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of circle: " + areaOfCircle);
        System.out.println("Circumference of circle: " + circumference);
    }

    public static void Calculate_Pyramid(double length, double width, double height) {
        double pyramidBaseArea = length * width;
        double pyramidVolume = pyramidBaseArea * height / 3;

        System.out.println("Base Area of Pyramid: " + pyramidBaseArea);
        System.out.println("Volume of Pyramid: " + pyramidVolume);
    }

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
        System.out.println("Enter 1 to get area and circumference of circle or enter 2 to get base area and volume of pyramid:");

        int inputType = scnr.nextInt();

        if (inputType == 1) {
            System.out.println("Enter the radius of the circle: ");
            double radiusInput = scnr.nextDouble();
            Calculate_circle(radiusInput);
        } else if (inputType == 2) {
            System.out.println("Enter the length of the pyramid:");
            double lengthInput = scnr.nextDouble();

            System.out.println("Enter the width of the pyramid:");
            double widthInput = scnr.nextDouble();
            
            System.out.println("Enter the height of the pyramid:");
            double heightInput = scnr.nextDouble();

            Calculate_Pyramid(lengthInput, widthInput, heightInput);
        } else {
            System.out.println("Invalid input");
        }
	}

}

