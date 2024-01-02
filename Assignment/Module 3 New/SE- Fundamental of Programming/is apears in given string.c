#include <stdio.h>
#include <string.h>

int countstr(const char *str) 
{
    const char *f = "is";
    int c = 0;
    int l = strlen(f);
    
    while (*str) 
	{
        if (strncmp(str, f, l) == 0) 
		{
            c++;
        }
        str++;
    }

}
main() 
{
    char inputString[1000];
    
    printf("Enter a string: ");
    fgets(inputString, sizeof(inputString), stdin);
    
    int result = countstr(inputString);
    
    printf("The word 'is' appears %d times in the given string.\n", result);

}

