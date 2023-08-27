//	W.A.J.P to find the second most frequent character in a given string. The given string is: successes The second most frequent char in the string is: c

package com.assignment;

public class Assignment19
{
	public static char findSecondMostFrequentchar(String str)
	{
		int[] charcount = new int[256];
		for(char ch:str.toCharArray())
		{
			charcount[ch]++;
		}
		int maxcount=0;
		int secondmaxcount=0;
		char secondMostFrequentchar=0;
		
		for(int i=0;i<charcount.length;i++)
		{
			if(charcount[i]>charcount[maxcount])
			{
				secondmaxcount=maxcount;
				maxcount=i;
			}
			else if(charcount[i]>charcount[secondmaxcount] && charcount[i]<charcount[maxcount])
			{
				secondmaxcount=i;
			}
		}
		return (char) secondmaxcount;
	}
	
	public static void main(String[] args)
	{
		String str="success";
		char secondMostFrequentchar=findSecondMostFrequentchar(str);
		System.out.println("The Second Most Frequent char in String is.."+secondMostFrequentchar);
	}
}
