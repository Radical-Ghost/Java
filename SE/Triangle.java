import java.util.*;

class Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter the length of sides of a triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a<(b+c) && b<(c+a) && c<(b+a))
        {
            if(a==b && b==c)
                System.out.println("Triangle is Equilateral");
            else if(a==b || b==c)
                System.out.println("Triangle is Isosceles");
            else System.out.println("Triangle is Scalene");
        }
        else System.out.println("Triangle cannot be formed!! Please enter correct lengths.");
    }
}