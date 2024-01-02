#include <stdio.h>

int isPalindrome(int num) 
{
    int o = num;
    int rev = 0;

    for (; num > 0; num /= 10) {
        int digit = num % 10;
        rev = rev * 10 + digit;
    }

    return o == rev;
}
main() 
{
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (isPalindrome(num)) 
	{
        printf("%d is a palindrome.\n", num);
    } 
	else 
	{
        printf("%d is not a palindrome.\n", num);
    }

}

