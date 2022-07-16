import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        //Code learned from: https://www.programiz.com/java-programming/examples/reverse-number

        int num = Integer.parseInt(scanner.next());
        int reversed = 0;

        while (num != 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }

        System.out.println(reversed);

    }
}