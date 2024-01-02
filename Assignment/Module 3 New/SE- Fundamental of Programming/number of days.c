#include <stdio.h>
main() 
{
    int monthNum;

    printf("Enter the month number (1-12): ");
    scanf("%d", &monthNum);

    if (monthNum >= 1 && monthNum <= 12)
	{
        if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) 
		{
            printf("Number of days in month %d: 30\n", monthNum);
        }
        else if (monthNum == 2) 
		{
            printf("Number of days in month %d: 28 or 29 (leap year)\n", monthNum);
        }
        else 
		{
            printf("Number of days in month %d: 31\n", monthNum);
        }
    }
	else 
	{
        printf("Invalid month number.\n");
    }
}

