import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isTrue = true;
        while (isTrue) {
            try {
                System.out.print("\nEnter the length: ");
                double length = scanner.nextInt();
                System.out.print("Enter the width: ");
                double width = scanner.nextInt();
                System.out.print("Enter the height: ");
                double height = scanner.nextInt();
                Parallelepiped abc = new Parallelepiped(length, width, height);
                System.out.println("The area of the parallelepiped is: " + abc.area());
                System.out.println("The volume of the parallelepiped is: " + abc.volume());
            } catch (InputMismatchException e) {
                System.out.println("Can't enter string!");
                isTrue = false;
            }
        }
    }
}
