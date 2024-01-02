#include <iostream>
#include <string>

class Address 
{
	public:
	    std::string street;
	    std::string city;
	    std::string state;
	    std::string zipCode;
};
class Student 
{
	public:
	    std::string name;
	    std::string className;
	    int rollNumber;
	    double marks;
	    Address address;
	
	    char calculateGrade() const 
		{
	        if(marks >= 90)
			{
				return 'A';
			} 
	        else if(marks >= 80)
			{
				return 'B';
			}
	        else if(marks >= 70)
			{
				return 'C';
			}
	        else if(marks >= 60)
			{
				return 'D';
			}
	        else
			{
				return 'F';
			}
	    }
	
	    void displayInfo() const 
		{
	        std::cout << "Name: " << name<<"\n";
	        std::cout << "Class: " << className<<"\n";
	        std::cout << "Roll Number: " << rollNumber<<"\n";
	        std::cout << "Marks: " << marks<<"\n";
	        std::cout << "Grade: " << calculateGrade()<<"\n";
	        std::cout << "Address: " << address.street  << address.city << address.state  << address.zipCode<<"\n";
	    }
};

main() 
{
    Address studentAddress{"83, bharatnagar chowkdi, ", "Bhavnagar, ", "Gujarat, ", "364002, "};
    Student student{"Aniket Parmar", "12th Grade", 101, 89, studentAddress};
    student.displayInfo();
}

