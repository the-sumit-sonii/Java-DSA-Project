import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,c=0,i,j;
		System.out.print("Enter limit : ");
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
			c=0;
			for(j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
		    	System.out.print(i + " ");
			}
		}	
	}
}