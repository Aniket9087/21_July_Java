#include <stdio.h>

void reverseString(char str[]) 
{
    if (str[0] == '\0') 
	{
        return; 
    }

    reverseString(str + 1);

    putchar(str[0]);
}

int main() 
{
    char str[100];

    printf("Enter a string: ");
    gets(str);

    printf("Reversed string: ");
    reverseString(str);
    printf("\n");
}

