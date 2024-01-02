#include <stdio.h>
main() 
{
    int c = 0; 
    int sum = 0;   
    int n;

    while (c < 10) 
	{
        printf("Enter number %d: ", c + 1);
        scanf("%d", &n);

        sum += n;

        c++;
    }

    printf("Sum of the 10 numbers is: %d\n", sum);
}

