import java.util.*;

class Menu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter your choice: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            int c = sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("Addition is: " + (a+b));
                    break;
                case 2:
                    System.out.println("Subtraction is: " + (a-b));
                    break;
                case 3:
                    System.out.println("Multiplication is: " + (a*b));
                    break;
                case 4:
                    System.out.println("Division is: " + (a/b));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? (y/n)");
            char ch = sc.next().charAt(0);
            if(ch=='n')
                break;
        }while(true);
    }
}