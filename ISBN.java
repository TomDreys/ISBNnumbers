import java.util.Scanner;

public class ISBN
{
    public static boolean testISBN(String ISBN)
    {
        char array[] = ISBN.toCharArray();
        int total = 0;
        
        for (int i = 0; i < ISBN.length(); i++)
        {
            if ((array[i] % 2) == 0)
            {
                total += array[i];
            }
            
            if ((array[i] % 2) != 0)
            {
                total += (array[i] * 3);
            }
        }
        
        if ((total + array[ISBN.length() - 1]) % 10 == 0)
        {
            return true;
        }
        
        else 
        {
            return false;
        }
    }
    
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ISBN number:");
        boolean isValid = false, valid;
        String ISBN = "";
        
        while (!isValid)
        {
            ISBN = scanner.next();
            
            if (ISBN.length() <= 13)
            {
                 isValid = true;
            }
            
            else
            {
                System.out.println("ISBN to long, Re-enter ISBN:");
            }
        }
        
        valid = (testISBN(ISBN));
        
        if (valid == true)
        {
            System.out.println("ISBN valid");
        }
        
        else
        {
             System.out.println("ISBN not valid");
        }
    }
}
