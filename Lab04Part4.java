//Lab4Part04

public class afterriskTree{
    public static void main(String[] args)
    {
        //create a for loop
        for(int i = 1; i <= 5; i++)
        {
            //create a for loop
            for(int j = 1; j <= 5 - i; j++)
            {
                //print empty character
                System.out.print(" ");

            }
            //create a for loop
            for(int k = 1; k <= (2 * i - 1); k++)
            {
                //print asterisks character
                System.out.print("*");
            }
            //print endline
            System.out.println();
        }

    }
}
