#include<iostream>
using namespace std;

class Calculator
{
	private:
	    int operand1;
	    int operand2;
	
	public:
	    Calculator(int a, int b)
		{
	        operand1 = a;
	        operand2 = b;
	    }
	
	    int add(int operand1,int operand2)
		{
	        return operand1 + operand2;
	    }
	
	    int subtract(int operand1,int operand2)
		{
	        return operand1 - operand2;
	    }
	
	    void multiply(int operand1,int operand2)
		{
	        return (operand1 * operand2);
	    }
	
	    void divide(int operand1,int operand2)
		{
	        return operand1 / operand2;
	    }
};

main() 
{
    
    Calculator calculator(5, 3);

    cout << "Addition: " << calculator.add() << endl;       
    cout << "Subtraction: " << calculator.subtract() << endl;
    cout << "Multiplication: " << calculator.multiply() << endl;
    cout << "Division: " << calculator.divide() << endl;        

}

