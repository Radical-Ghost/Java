import java.util.Scanner;

class Sort{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int i,j,temp,n;

        System.out.println("Enter the number of elements: ");
        n=s.nextInt();

        System.out.println("Enter the array: ");
        int a[]=new int[n];
        for (i=0;i<n;i++)
            a[i]=s.nextInt();

        for (i=0;i<n;i++){
            temp = a[i];
            j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1] = temp;
        }

        System.out.println("Sorted array is: ");
        for (i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}