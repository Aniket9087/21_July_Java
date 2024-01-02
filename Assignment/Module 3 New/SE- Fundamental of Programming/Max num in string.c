#include <stdio.h>

int findMaxLength(const char *str) 
{
    int maxLength = 0;

    while (*str != '\0') 
	{
        maxLength++;
        str++;
    }

    return maxLength;
}
main() 
{
    char myString[] = "This is a sample string.";

    int maxLength = findMaxLength(myString);

    printf("Maximum number of characters in the string: %d\n", maxLength);

}

