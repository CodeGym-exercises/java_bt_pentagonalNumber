import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.printf("Pentagonal Number is " + getPentagonalNumber(number));
    }
    public static int getPentagonalNumber(int n){
        return n*(3*n-1)/2;
    }
}
