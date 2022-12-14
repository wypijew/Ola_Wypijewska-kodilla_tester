import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "ADD";
                case "S":
                    return "SUB";
                case "D":
                    return "DIV";
                case "M":
                    return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }

    public static String getColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter (B-black, Y-yellow, R-red, O-orange, G-green, P-purple, W-white):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B":
                    return "black";
                case "G":
                    return "green";
                case "O":
                    return "orange";
                case "P":
                    return "purple";
                case "R":
                    return "red";
                case "W":
                    return "white";
                case "Y":
                    return "yellow";
                default:
                    System.out.println("Wrong letter. Try again");
            }
        }
    }
}