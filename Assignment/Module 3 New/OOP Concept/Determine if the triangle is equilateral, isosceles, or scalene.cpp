#include <iostream>
using namespace std;

class Triangle 
{
	private:
	    int side1;
	    int side2;
	    int side3;
	
	public:
	    Triangle(int s1, int s2, int s3) 
		{
	        side1 = s1;
	        side2 = s2;
	        side3 = s3;
	    }
	
	    bool isEquilateral() const 
		{
	        return (side1 == side2) && (side2 == side3);
	    }
	
	    bool isIsosceles() const 
		{
	        return (side1 == side2) || (side1 == side3) || (side2 == side3);
	    }
	
	    bool isScalene() const 
		{
	        return (side1 != side2) && (side1 != side3) && (side2 != side3);
	    }
};

main() 
{
    Triangle triangle1(3, 3, 3);    
    Triangle triangle2(3, 4, 4);    
    Triangle triangle3(3, 4, 5);    

    cout << "Triangle 1 is ";
    if (triangle1.isEquilateral()) 
	{
        cout << "equilateral." << endl;
    }
	else if (triangle1.isIsosceles()) 
	{
        cout << "isosceles." << endl;
    }
	else 
	{
        cout << "scalene." << endl;
    }

    cout << "Triangle 2 is ";
   if (triangle2.isEquilateral()) 
	{
        cout << "equilateral." << endl;
    }
	else if (triangle2.isIsosceles()) 
	{
        cout << "isosceles." << endl;
    }
	else 
	{
        cout << "scalene." << endl;
    }

    cout << "Triangle 3 is ";
    if (triangle3.isEquilateral()) 
	{
        cout << "equilateral." << endl;
    }
	else if (triangle3.isIsosceles()) 
	{
        cout << "isosceles." << endl;
    }
	else 
	{
        cout << "scalene." << endl;
    }

}

