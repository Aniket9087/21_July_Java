#include <stdio.h>
main() 
{
    int mnum;

    printf("Enter the month number (1-12): ");
    scanf("%d", &mnum);

    if (mnum == 1) 
	{
        printf("January\n");
    } 
	else if (mnum == 2) 
	{
        printf("February\n");
    } 
	else if (mnum == 3) 
	{
        printf("March\n");
    } 
	else if (mnum == 4) 
	{
        printf("April\n");
    } 
	else if (mnum == 5) 
	{
        printf("May\n");
    } 
	else if (mnum == 6) 
	{
        printf("June\n");
    } 
	else if (mnum == 7) 
	{
        printf("July\n");
    } 
	else if (mnum == 8) 
	{
        printf("August\n");
    } 
	else if (mnum == 9) 
	{
        printf("September\n");
    } 
	else if (mnum == 10) 
	{
        printf("October\n");
    } 
	else if (mnum == 11) 
	{
        printf("November\n");
    } 
	else if (mnum == 12) 
	{
        printf("December\n");
    } 
	else 
	{
        printf("Invalid month number.\n");
    }
}

