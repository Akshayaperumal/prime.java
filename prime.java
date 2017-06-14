# prime.java
import java.io.*;
import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int count=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("prime number");
        }
        
        else
        {
            System.out.println("not prime number");
        }
    }
}
