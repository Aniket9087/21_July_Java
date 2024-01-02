#include <stdio.h>
#include <string.h>

void reverseString(char str[]) 
{
    int length = strlen(str);
    int start = 0;
    int end = length - 1;

    while (start < end) 
	{
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        start++;
        end--;
    }
}

int isPalindrome(char str[]) 
{
    int length = strlen(str);
    int start = 0;
    int end = length - 1;

    while (start < end) 
	{
        if (str[start] != str[end]) 
		{
            return 0; 
        }

        start++;
        end--;
    }

    return 1; 
}
main() 
{
    char myString[100];

    printf("Enter a string: ");
    gets(myString);

    reverseString(myString);

    printf("Reversed string: %s\n", myString);

    if (isPalindrome(myString)) 
	{
        printf("The string is a palindrome.\n");
    } 
	else 
	{
        printf("The string is not a palindrome.\n");
    }
}

