#include <stdio.h>
main() 
{

    int n1, n2, n3, l;

    printf("Enter three numbers: ");
    scanf("%d %d %d", &n1, &n2, &n3);

    if (n1 >= n2 && n1 >= n3) 
	{
        l = n1;
    }
	else if (n2 >= n1 && n2 >= n3) 
	{
        l = n2;
    }
	else 
	{
        l = n3;
    }

    printf("The largest number is: %d\n", l);

}

