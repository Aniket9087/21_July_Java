#include <stdio.h>
main() 
{
    int n = 0;
    int even = 0, odd = 0;
    int num;

    while (n < 5) 
	{
        printf("Enter number %d: ", n + 1);
        scanf("%d", &num);

        if (num % 2 == 0) 
		{
            even++;
        } else 
		{
            odd++;
        }

        n++;
    }

    printf("Number of even numbers: %d\n", even);
    printf("Number of odd numbers: %d\n", odd);

}

