import java.util.*;

class Matrix
{
    public static void main(String[] args)
    {
        int n;
        int[][] a=new int[100][100];
        int[][] b=new int[100][100];

        System.out.print("\n1.Addition\n2.Subtraction\n3.Multiplication\n");
        System.out.println("Enter your choice for operation on matrix: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        Mx m=new Mx();

        switch (n)
        {
            case 1 :m.scan(sc, a, b);
                    m.add(a, b);
                    break;
            case 2 :m.scan(sc, a, b);
                    m.sub(a, b);
                    break;
            case 3 :m.scan(sc, a, b);
                    m.mul(a, b);
                    break;
            default :System.out.println("Invalid input");
        }
        //check weather the matrix is symmetric or not
        int i,j;
        int flag=1;
        for(i=0;i<m.o;i++)
        {
            for(j=0;j<m.o;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1)
            System.out.println("Matrix is symmetric");
        else
            System.out.println("Matrix is not symmetric");
    }
}

class Mx
{
    int o;
    public void scan(Scanner sc, int[][] a, int[][] b)
    {
        int i,j;
        System.out.println("Enter the order of matrix:");
        o=sc.nextInt();

        System.out.println("Enter matrix A: ");
        for(i=0;i<o;i++)
            for(j=0;j<o;j++)
                a[i][j]=sc.nextInt();

        System.out.println("Enter matrix b: ");
        for(i=0;i<o;i++)
            for(j=0;j<o;j++)
                b[i][j]=sc.nextInt();
    }
    public void add(int[][] a, int[][] b)
    {
        int i,j;
        int[][] z=new int[100][100];
        System.out.println("Addition of matrix is: ");
        for( i=0;i<o;i++)
        {
            for(j=0;j<o;j++)
            {
                z[i][j]=a[i][j]+b[i][j];
                System.out.print(z[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    public void sub(int[][] a, int[][]b)
    {
        int i,j;
        int[][] z=new int[100][100];
        System.out.println("Subtraction of matrix is: ");
        for( i=0;i<o;i++)
        {
            for(j=0;j<o;j++)
            {
                z[i][j]=a[i][j]-b[i][j];
                System.out.print(z[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }

    public void mul(int[][] a, int[][]b)
    {
        int i,j,r;
        int[][] z=new int[100][100];
        System.out.println("Multiplication of matrix is: ");
        for( i=0;i<o;i++)
        {
            for(j=0;j<o;j++)
            {
                z[i][j]=0;
                for(r=0;r<o;r++)
                    z[i][j]+=a[i][r]*b[r][j];
                System.out.print(z[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}