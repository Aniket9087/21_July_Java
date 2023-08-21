//	Write a program in Java to make such a pattern like right angle triangle with number increased by 1.

package com.simple;

public class RightAngleTriangleWithNumberIncreasedBy1
{
	public static void main(String[] args)
	{
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}
