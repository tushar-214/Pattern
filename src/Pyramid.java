public class Pyramid
{
    public static void main(String[] args)
    {
       for(int i=1;i<=5;i++)
       {
           for (int j=5;i<j;j--)
           {
               System.out.print(" ");
           }
           for (int k=1;k<=i;k++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }


    }
}
