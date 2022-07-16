import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int inputNumber = Integer.parseInt(scanner.next());
        int nextEvenNumber = 0;

        if (inputNumber % 2 == 0) {
            nextEvenNumber = inputNumber + 2;
        } else {
            nextEvenNumber = inputNumber + 1;
        }

        System.out.println(nextEvenNumber);

    }
}