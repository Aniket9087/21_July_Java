#include <stdio.h>
main() 
{
    int mnum;

    printf("Enter the month number (1-12): ");
    scanf("%d", &mnum);

    
    if (mnum == 1 || mnum == 3 || mnum == 5 || mnum == 7 || mnum == 8 || mnum == 10 || mnum == 12) 
	{
        printf("Number of days in the month: 31\n");
    } 
	else if (mnum == 4 || mnum == 6 || mnum == 9 || mnum == 11) 
	{
        printf("Number of days in the month: 30\n");
    } 
	else if (mnum == 2) 
	{
        printf("Number of days in the month: 28 or 29 (leap year)\n");
    } 
	else 
	{
        printf("Invalid month number.\n");
    }
}

