import java.util.Scanner;

class WtoUpperCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Line: ");
        String Line = sc.nextLine();
        
        char[] r = new char[Line.length()];
        r[0] = Character.toUpperCase(Line.charAt(0));

        for(int i=1; i<Line.length(); i++){
            char c = Line.charAt(i);

            if(c==' ')
            {
                r[i] = c;
                i++;
                r[i] = Character.toUpperCase(Line.charAt(i));
            }
            else r[i] = c;
        }
        
        System.out.println(r);
    }
}