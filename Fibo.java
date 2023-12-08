import java.util.Scanner;
public class Fibo
{
 public static void main(String args[])
    {
	Scanner x=new Scanner(System.in);
	int num=x.nextInt();   
 	System.out.println("Enter the range: ");
        for (int i = 0; i < num; i++) {
 
            System.out.print(fibo(i) + " ");
        }
    }
    static int fibo(int n)
    {
        if (n <= 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}
