import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    Int i, j, rows;
    Scanner sc= new Scanner(System.in);
      Int i, j,base
      System.out.println(“Enter base of triangle:”);
      base = sc.nextInt();	

    for (i=1;  i<= base; i++)
    {
      for (j = num; j>=i; j-=1)
      {
        System.out.print(“* ”);
      }
      System.out.println(“”);
    }
   
  }
}
