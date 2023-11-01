import java.util.Scanner;

class Factorial{
    public static void main(String args[]){
        int n,i,f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
            f=f*i;
        System.out.println("The factorial is: "+f);
    }
}

// import java.util.Scanner;

// class UppercaseFirstLetters {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();

//         char[] result = new char[input.length()];
//         boolean newWord = true;

//         for (int i = 0; i < input.length(); i++) {
//             char c = input.charAt(i);

//             if (c==' ') {
//                 newWord = true;
//                 result[i] = c;
//             } else if (newWord) {
//                 result[i] = Character.toUpperCase(c);
//                 newWord = false;
//             } else {
//                 result[i] = Character.toLowerCase(c);
//             }
//         }

//         System.out.println("Converted string: " + new String(result));

//         scanner.close();
//     }
// }
