#include<iostream>
using namespace std;

class Calculator 
{
	public:
    	int add(int num1, int num2)
		{
        	cout << "Sum Of Numbers Is: " << num1 + num2 << endl;
		    cout << "Subtraction Of Numbers Is: " << num1 - num2 <<endl;
		    cout << "Multiplication Of Numbers Is: " << num1 * num2 <<endl;
		    cout << "Division Of Numbers Is: " << num1 / num2 <<endl;
		    cout << "Modulo Of Numbers Is: " << num1 % num2 <<endl;
    	}

};

main() 
{
    Calculator calc;

    int num1, num2;
	int doo;
    cout << "Enter value of number 1: ";
    cin >> num1;

	cout << "Enter value of number 2: ";
    cin >> num2;

   calc.add(num1,num2);
}

