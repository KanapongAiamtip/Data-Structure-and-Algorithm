import java.util.Scanner;
//Input the value no more than 5 integers separated by space and find the max value if input more than 5 print max input
public class BasicArray3 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String inputs = in.nextLine();
        String[] arrStrOfInputs = inputs.split(" ");
        int[] arrIntOfInputs = new int[arrStrOfInputs.length];
        for (int counter=0; counter<arrIntOfInputs.length; counter++)
        {
          arrIntOfInputs[counter] = Integer.parseInt(arrStrOfInputs[counter]);
        }
        if(arrIntOfInputs.length>5)
        {
          System.out.println("max input");
        }
        else
        {
          max(arrIntOfInputs);
        }
    }
    private static void max(int a[])
    {
      int max = a[0];
      for(int i=0;i<a.length;++i)
      {
        if(max<a[i])
        {
          max=a[i];
        }       
      }
      System.out.println(max);
    }
}