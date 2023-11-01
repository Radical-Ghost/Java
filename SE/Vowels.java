import java.util.*;

class Vowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char z;

        System.out.println("Enter any character: ");
        z = sc.next().charAt(0);

        if(z=='A' || z=='E' || z=='I' ||z=='O' || z=='U' || z=='a' || z=='e' || z=='i' || z=='o' || z=='u')
            System.out.println(z+" is a Vowel.");
        else System.out.println(z+" is a Consonant.");
    }
}