#include<iostream>
using namespace std;

class Rectangle 
{
	private:
	    double length;
	    double width;
	
	public:
	    double calculateArea(length,width) 
		{
	        return length * width;
	    }
	    double calculatePerimeter(length,width) 
		{
	        return 2 * (length + width);
	    }
};
main() 
{
    Rectangle myRectangle;
    int Length, Width;
    cout << "Enter the length of the rectangle: ";
    cin >> Length;
    cout << "Enter the width of the rectangle: ";
    cin >> Width;
    cout << "Area: " << myRectangle.calculateArea(length,width) << endl;
    cout << "Perimeter: " << myRectangle.calculatePerimeter(length,width) << endl;

}

