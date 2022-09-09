import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        double diameter;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a num to find Area of Circle");
        diameter =scanner.nextDouble();


        //formula for area of a circle
        double area = (3.14 * diameter * diameter)/4;
        System.out.println("Area is "+area);
    }
}
