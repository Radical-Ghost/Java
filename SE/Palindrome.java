import java.util.*;

class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,t,s=0,r;

        System.out.println("Enter any number: ");
        t = n = sc.nextInt();


        while(n!=0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }

        if(s==t)
            System.out.println(t+" is palindrome.");
        else System.out.println(t+" is not palindrome.");

    }
}