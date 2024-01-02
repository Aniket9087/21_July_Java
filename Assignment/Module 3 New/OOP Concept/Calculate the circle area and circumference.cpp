#include<iostream>
using namespace std;

class Circle 
{
	public:
	    void getRadius(int Radius)  
		{
	        cout<<Radius;
	    }
	public:    
	    void calculateArea(int Radius)
		{
	       cout<<3.14 * Radius * Radius;
	    }
    
    calculateCircumference(int Radius)
	{
        cout<<2 * 3.14 * Radius;
    }
};

main() 
{
    Circle myCircle;

    int Radius;
    cout << "Enter the radius of the circle: ";
    cin >> Radius;
   

    cout << "Radius: " << myCircle.getRadius(Radius) << endl;
    cout << "Area: " << myCircle.calculateArea(Radius) << endl;
    cout << "Circumference: " << myCircle.calculateCircumference(Radius) << endl;
    
}

