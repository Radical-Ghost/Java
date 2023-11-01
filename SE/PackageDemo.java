import java.util.Scanner;
import CalculateDemo.Calculate;

class PackageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculate c = new Calculate();
        System.out.println("Sum: " + c.add(a, b));
        System.out.println("Difference: " + c.sub(a, b));
    }
}
