import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        String end = "go";


        System.out.println("What is your min value?");
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        System.out.println("What is your max value?");
        int max = in.nextInt();

        while(!end.equals("exit"))
        {
            System.out.println("Generate random number? (y/n)");
            String dec = in.next().toLowerCase();

            if (dec.equals("y"))
            {
                System.out.println((int)(Math.random()*max) + min);
            }
            else if (dec.equals("n"))
            {
                end = "exit";
            }
        }


    }
}