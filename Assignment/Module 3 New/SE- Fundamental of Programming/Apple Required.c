#include<stdio.h>
main()
{
	int st_num;
	int appleperstudent=5;
	int totalapple;
	
	printf("Enter the Number of Students...");
	scanf ("%d",&st_num);
	
	totalapple=st_num*appleperstudent;
	
	printf("Total Apples Required is...%d",totalapple);
	
	
}
