import java.util.Scanner;

class FreqS{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String a = s.nextLine();

        StringBuffer p = new StringBuffer(a);

        System.out.println("Enter string to be appended: ");
        String b = s.nextLine();
        p.append(b);
        System.out.println("Appended String is: " + p);

        System.out.println("Enter elements to be inserted and its position: ");
        String c = s.next();
        int z = s.nextInt();
        p.insert(z,c);
        System.out.println("String after insertion is: " + p);

        System.out.println("Enter elements to be replaced and its starting and ending position: ");
        String d = s.next();
        int y = s.nextInt();
        int x = s.nextInt();
        p.replace(y,x,d);
        System.out.println("String after replacing is: " + p);

        System.out.println("Enter position of elements to be deleted: ");
        int w = s.nextInt();
        int v = s.nextInt();
        p.delete(w,v);
        System.out.println("String after deletion is: " + p);

        p.reverse();
        System.out.println("Reversed string is: " + p);
    }
}