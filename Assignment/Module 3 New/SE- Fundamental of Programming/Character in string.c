#include <stdio.h>

void countCharacters(const char *str) 
{
    int alphabets = 0, digits = 0, specialCharacters = 0;

    while (*str) 
	{
        if ((*str >= 'a' && *str <= 'z') || (*str >= 'A' && *str <= 'Z')) 
		{
            alphabets++;
        }
        else if (*str >= '0' && *str <= '9') 
		{
            digits++;
        }
        else 
		{
            specialCharacters++;
        }
        str++;
    }

    printf("Alphabets: %d\n", alphabets);
    printf("Digits: %d\n", digits);
    printf("Special Characters: %d\n", specialCharacters);
}
main() 
{
    char myString[] = "Hello123@World";

    countCharacters(myString);

}

