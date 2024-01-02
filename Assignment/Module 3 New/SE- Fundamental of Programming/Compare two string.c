#include <stdio.h>

int compareStrings(const char *str1, const char *str2) 
{
    while (*str1 != '\0' && *str2 != '\0') 
	{
        if (*str1 != *str2) 
		{
            return 0; 
        }

        str1++;
        str2++;
    }

    return (*str1 == '\0' && *str2 == '\0');
}
main() 
{
    char str1[] = "Hello";
    char str2[] = "Hello";

    if (compareStrings(str1, str2)) 
	{
        printf("The strings are equal.\n");
    } 
	else 
	{
        printf("The strings are not equal.\n");
    }

}

