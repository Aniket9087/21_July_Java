#include <stdio.h>

void character(const char *str) 
{
    int i = 0;
    
    while (str[i] != '\0') 
	{
        printf("%c\n", str[i]);
        i++;
    }
}
main() 
{
    char myString[] = "Separate";

    character(myString);

}

