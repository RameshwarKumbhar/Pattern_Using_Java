package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows count : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)             //     for(int j=n-1;j>=i;j--)
				System.out.print(" ");
			for(int k=0;k<=i;k++)
				System.out.print("*");
		System.out.println();
		}

	}
}

