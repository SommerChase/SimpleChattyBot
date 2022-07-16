import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String name = scanner.next();
        String yoe = scanner.next();
        String style = scanner.next();

        System.out.println("The form for "
                + name
                + " is completed. We will contact you if we need a chef who cooks "
                + style
                + " dishes and has "
                + yoe
                + " years of experience.");
    }
}