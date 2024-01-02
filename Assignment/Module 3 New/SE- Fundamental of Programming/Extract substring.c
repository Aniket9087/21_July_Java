#include <stdio.h>

void extractSubstring(const char *source, char *destination, int start, int length) 
{
    int i, j;

    for (i = start, j = 0; j < length && source[i] != '\0'; i++, j++) 
	{
        destination[j] = source[i];
    }

    destination[j] = '\0';
}
main() 
{
    char sourceString[] = "Extracting Substring Example";
    char destinationString[20];  

    extractSubstring(sourceString, destinationString, 10, 9);

    printf("Original String: %s\n", sourceString);
    printf("Extracted Substring: %s\n", destinationString);

}

