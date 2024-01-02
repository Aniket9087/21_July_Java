#include <stdio.h>
main() 
{	
    int weekNum;

    printf("Enter the week number (1-7): ");
    scanf("%d", &weekNum);

    if (weekNum >= 1 && weekNum <= 7) 
	{
        if (weekNum == 1) 
		{
            printf("Day of the week: Sunday\n");
        } 
		else if (weekNum == 2) 
		{
            printf("Day of the week: Monday\n");
        } 
		else if (weekNum == 3) 
		{
            printf("Day of the week: Tuesday\n");
        } 
		else if (weekNum == 4) 
		{
            printf("Day of the week: Wednesday\n");
        } 
		else if (weekNum == 5) 
		{
            printf("Day of the week: Thursday\n");
        } 
		else if (weekNum == 6) 
		{
            printf("Day of the week: Friday\n");
        } 
		else 
		{
            printf("Day of the week: Saturday\n");
        }
    } 
	else 
	{
        printf("Invalid week number. \n");
    }

    return 0;
}

