import java.util.*;

class Recognition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char z;
        String sp=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";

        System.out.println("Enter any character: ");
        z = sc.next().charAt(0);

        if(z=='A' || z=='E' || z=='I' ||z=='O' || z=='U' || z=='a' || z=='e' || z=='i' || z=='o' || z=='u')
            System.out.println(z+" is a Vowel.");
        else if(z>='0' && z<='9')
            System.out.println(z+" is a Number.");
        else if(sp.contains(Character.toString(z)))
            System.out.println(z+" is a Symbol.");
    }
}