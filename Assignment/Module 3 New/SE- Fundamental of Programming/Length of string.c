#include <stdio.h>

int findStringLength(const char *str) 
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
    char myString[] = "Hello, World!";
    
    int length = findStringLength(myString);
    printf("Length of the string: %d\n", length);

}

