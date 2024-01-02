#include <iostream>
#include <string>
using namespace std;

class Employee 
{
private:
    string name;
    int employeeID;
    double salary;

public:
    Employee(const string& empName, int empID, double initialSalary): name(empName), employeeID(empID), salary(initialSalary) {}

    string getName() const 
	{
        return name;
    }

    int getEmployeeID() const 
	{
        return employeeID;
    }

    int getSalary() const 
	{
        return salary;
    }

    void calculateSalary(int performanceRating) 
	{
        salary = salary* (1.0 + performanceRating);
    }
};

int main() 
{
    Employee emp1("Aniket parmar", 12345, 50000);

    cout << "Employee Name: " << emp1.getName() << endl;
    cout << "Employee ID: " << emp1.getEmployeeID() << endl;
    cout << "Initial Salary: " << emp1.getSalary() << endl;

    emp1.calculateSalary(0.1); 

    cout << "\nUpdated Salary: " << emp1.getSalary() << endl;

    return 0;
}

