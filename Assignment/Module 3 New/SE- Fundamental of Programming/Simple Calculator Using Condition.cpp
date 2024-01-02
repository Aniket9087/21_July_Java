#include <stdio.h>
main() 
{
    
    float n1, n2, result;
    char ch;

    printf("Enter first number: ");
    scanf("%f", &n1);

    printf("Enter the character(+, -, *, /, %%): ");
    scanf(" %c", &ch); 

    printf("Enter second number: ");
    scanf("%f", &n2);

    if (ch == '+') 
	{
        result = n1 + n2;
        printf("Result: %.2f\n", result);
    } else if (ch == '-') 
	{
        result = n1 - n2;
        printf("Result: %.2f\n", result);
    } else if (ch == '*') 
	{
        result = n1 * n2;
        printf("Result: %.2f\n", result);
    } else if (ch == '/') 
	{
        if (n2 != 0) {
            result = n1 / n2;
            printf("Result: %.2f\n", result);
        } else {
            printf("Error: Division by zero is not allowed.\n");
        }
    } else if (ch == '%') 
	{
        if (n2 != 0) 
		{
            result = (int)n1 % (int)n2;
            printf("Result: %.2f\n", result);
        } else 
		{
            printf("Error: Modulo by zero is not allowed.\n");
        }
    } else 
	{
        printf("Invalid.\n");
    }

    return 0;
}

