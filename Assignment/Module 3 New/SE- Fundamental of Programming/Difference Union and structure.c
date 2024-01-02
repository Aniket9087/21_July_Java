#include <stdio.h>
struct Person 
{
    char name[20];
    int age;
    float height;
};

union Info 
{
    int id;
    float salary;
};

main() 
{
    struct Person person1;

    printf("Enter name: ");
    scanf("%s", person1.name);

    printf("Enter age: ");
    scanf("%d", &person1.age);

    printf("Enter height: ");
    scanf("%f", &person1.height);

    printf("\nStructure - Person:\n");
    printf("Name: %s\n", person1.name);
    printf("Age: %d\n", person1.age);
    printf("Height: %.2f\n", person1.height);

    union Info info1;

    printf("\nEnter ID: ");
    scanf("%d", &info1.id);

    printf("Enter Salary: ");
    scanf("%f", &info1.salary);

    printf("\nUnion - Info:\n");
    printf("ID: %d\n", info1.id);
    printf("Salary: %.2f\n", info1.salary);
}

