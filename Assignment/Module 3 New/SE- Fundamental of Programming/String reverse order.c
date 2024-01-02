#include <stdio.h>

void printReverse(const char *str) 
{
	int i;
    int length = 0;

    while (str[length] != '\0') 
	{
        length++;
    }

    for (i = length - 1; i >= 0; i--) 
	{
        printf("%c\n", str[i]);
    }
}
main() 
{
    char myString[] = "Reverse";

    printReverse(myString);

}

