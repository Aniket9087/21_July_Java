#include <stdio.h>
main() 
{
    int num1, num2, sum;

    printf("Enter the first number: ");
    scanf("%d", &num1);

    printf("Enter the second number: ");
    scanf("%d", &num2);

    sum = num1 + num2;

    printf("Sum: %d\n", sum);

    if (sizeof(sum) == 2) 
	{
        printf("The sum is a 2-byte integer.\n");
    } 
	else if (sizeof(sum) == 4) 
	{
        printf("The sum is a 4-byte integer.\n");
    } 
	else if (sizeof(sum) == 8) 
	{
        printf("The sum is an 8-byte integer.\n");
    } 
	else 
	{
        printf("The size of the sum is not 2, 4, or 8 bytes.\n");
    }

}

