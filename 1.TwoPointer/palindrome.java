public class palindrome 
{
    public static void main(String[] args) 
    {
    String s = "madam";
    int left = 0;
    int right = s.length() - 1;

    while (left < right) 
    {

          if (s.charAt(left) != s.charAt(right))
        {
           System.out.println("String is not palindrome");
           return;
        }

        left++;
        right--;
    }

    System.out.println("String is palindrome");
    
}
}
