#include <stdio.h>

void copyString(char *destination, const char *source) 
{
    while (*source) 
	{
        *destination = *source;

        source++;
        destination++;
    }

    *destination = '\0';
}
main() 
{
    char sourceString[] = "Hello, World!";
    char destinationString[50];

    copyString(destinationString, sourceString);

    printf("Source String: %s\n", sourceString);
    printf("Destination String: %s\n", destinationString);

}

