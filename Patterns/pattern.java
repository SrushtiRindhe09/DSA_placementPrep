import java.util.Scanner;
class pattern {
   public static void pattern1(int n)
    {
      for (int i=0 ;i<n; i++)
      {
        for(int j=0; j<n; j++)
            {
                System.out.print("* ");
            }
          System.out.println();
      }
    }
    public static void pattern2(int n)
    {
      for (int i=0 ;i<n; i++)
      {
        for(int j=0; j<i; j++)
            {
                System.out.print("* ");
            }
          System.out.println();
      }
    }

    public static void pattern3(int n)
    {
      for (int i=0 ;i<n; i++)
      {
        for(int j=0; j<i; j++)
            {
                System.out.print(j + " ");
            }
          System.out.println();
      }

    } 
    public static void pattern4(int n)
    {
      for (int i=0 ;i<n; i++)
      {
        for(int j=0; j<i; j++)
            {
                System.out.print(i + " ");
            }
          System.out.println();
      }
    }

     public static void pattern5(int n)
    {
      for (int i=1 ;i<=n; i++)
      {
        for(int j=0; j<n-i+1; j++)
            {
                System.out.print("* ");
            }
          System.out.println();
      }
    }
     public static void pattern6(int n)
    {
      for (int i=0 ;i<=n; i++)
      {
        for(int j=1; j<n-i+1; j++)
            {
                System.out.print(j + " ");
            }
          System.out.println();
      }
    }
    public static void pattern7(int n)
    {
      for (int i=0 ;i<n; i++)
      {
           for(int j=0; j<n-i; j++)
            {
                System.out.print(" ");
            }
                for(int j=1; j<=2*i-1; j++)
                    { 
                        System.out.print("*");
                    }
                       for(int j=0; j<n+i-1; j++)
                         {
                            System.out.print(" ");
                         }
          System.out.println();
                    }
            
            }
    public static void pattern8(int n)
    {
        for(int i= 0; i<=n; i++)
            {
                for(int j=0; j<=i; j++)
                    {
                        System.out.print(" ");
                    }
                for(int j=0; j<2*n-(2*i+1); j++)
                    {
                        System.out.print("*");
                    }
                for(int j=0; j<i; j++)
                    {
                        System.out.print(" ");
                    }
                System.out.println();
            }
    }
    public static void pattern10(int n)
    {
        for(int i=1; i<=2+n-1; i++)
            {
                int stars = i;
                if(i>n) stars = 2+n-i;
                for(int j=1; j<=stars; j++)
                    {
                        System.out.print("*");
                    }
                System.out.println();
            }
        
    }
    public static void pattern11(int n)
    {
        int start =1;
        for(int i=0; i<n; i++)
            {
                if(i%2 == 0) start =1;
                else start = 0;
                for(int j=0; j<i; j++)
                    {
                        System.out.print(start);
                        start = 1-start;
                    }
                System.out.println();
            }
    }
    public static void pattern12(int n)
    {
        for(int i =1; i<=n; i++)
            {
                for(int j=1; j<=i; j++)
                    {
                        System.out.print(j+" ");
                    }
                for(int j=1; j<=2*(n-i); j++)
                    {
                        System.out.print(" ");
                    }
                for(int j=i;j>=1; j--)
                    {
                        System.out.print(j+" ");
                    }
                System.out.println();
            }
    }
    public static void pattern13(int n)
    {
        int num=1;
        for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=i; j++)
                    {
                        System.out.print(num+" ");
                        num= num+1;
                    }
                System.out.println();
            }
    }
    public static void pattern14(int n)
    {  
        for(int i=1; i<=5; i++)
     {
        char ch = 'A';
        for(int j=1; j<=i; j++)
            {
                System.out.print(ch+" ");
                ch++;
             }
                System.out.println();
     }
    }
    public static void pattern15(int n)
    {
        for(int i=0; i<n; i++)
            {
                for(char ch='A'; ch<='A'+(n-i-1); ch++)
                    {
                        System.out.print(ch+" ");
                    }
                System.out.println();
            }
    }
    public static void pattern16(int n)
    {
        for(int i=0; i<n; i++)
            {
                char ch = 'A'+1;
                for(int j=0; j<i; j++)
                    {
                        System.out.print(ch+" ");
                    }
                System.out.println();
            }
    }
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern16(n);
        sc.close();
    }
}