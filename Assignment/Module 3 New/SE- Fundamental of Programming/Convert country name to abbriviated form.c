#include <stdio.h>
#include <string.h>
main() 
{
    char c[100];
    int i;

    printf("Enter the country's name: ");
    gets(c);

    for (i = 0; c[i]; i++) 
	{
        c[i] = toupper(c[i]);
    }

    printf("Abbreviation: ");
    if (strcmp(c, "UNITED STATES") == 0) 
	{
        printf("USA");
    } 
	else if (strcmp(c, "UNITED KINGDOM") == 0) 
	{
        printf("UK");
    } 
	else if (strcmp(c, "CANADA") == 0) 
	{
        printf("CAN");
    } 
	else 
	{
        printf("Abbreviation not defined for this country");
    }

    printf("\n");

}

