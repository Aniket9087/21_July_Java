#include <stdio.h>
main() 
{
    float num1, num2, result;
    int choice;

    do {
        printf("\nMenu:\n");
        printf("1. Addition\n");
        printf("2. Subtraction\n");
        printf("3. Multiplication\n");
        printf("4. Division\n");
        printf("5. Exit\n");
        printf("Enter your choice (1-5): ");
        scanf("%d", &choice);

        if (choice >= 1 && choice <= 4) 
		{
            printf("Enter two numbers: ");
            scanf("%f %f", &num1, &num2);
        }

        switch (choice) 
		{
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) 
				{
                    result = num1 / num2;
                } 
				else 
				{
                    printf("Error:\n");
                    continue; 
                }
                break;
            case 5:
                printf("Exiting the program.\n");
                break;
            default:
                printf("Invalid choice! \n");
                continue;  // Skip to the next iteration
        }

        if (choice >= 1 && choice <= 4) 
		{
            printf("Result: %.2f\n", result);
        }

    } while (choice != 5);
}

