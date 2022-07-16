import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        int numberFour = scanner.nextInt();

        int incrementOne = --numberOne;
        int incrementTwo = --numberTwo;
        int incrementThree = --numberThree;
        int incrementFour = --numberFour;

        System.out.print(incrementOne + " ");
        System.out.print(incrementTwo + " ");
        System.out.print(incrementThree + " ");
        System.out.print(incrementFour);

    }
}