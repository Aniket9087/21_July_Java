#include <stdio.h>

int stringLength(char str[]) 
{
    int length = 0;

    while (str[length] != '\0') 
	{
        length++;
    }

    return length;
}
main() 
{
    char myString[100];

    printf("Enter a string: ");
    gets(myString);

    int length = stringLength(myString);
    printf("Length of the string: %d\n", length);
}

