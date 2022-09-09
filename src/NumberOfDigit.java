import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {

        int number,count=0;
        System.out.println("Enter a Number ");
        Scanner scanner=new Scanner(System.in);
        number =scanner.nextInt();

        while(number >0) {
            count++;
            number = number /10;
        }
        System.out.println("Number of Digits = "+count);
    }
}
