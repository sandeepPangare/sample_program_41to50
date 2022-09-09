import java.util.Scanner;

public class MaxNumberHandshake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int persons = scanner.nextInt();
        System.out.println("Enter a Person");


        int Handshakes = persons * (persons - 1) / 2;
        System.out.println("For "+ persons +" people there will be " +Handshakes+" handshakes");
    }
}
