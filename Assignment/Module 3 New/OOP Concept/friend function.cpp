
#include <iostream>
using namespace std;
class Swap 
{
	int a, b;

public:
	Swap(int a, int b)
	{
		this->a = a;
		this->b = b;
	}
	friend void swap(Swap&);
};

void swap(Swap& s1)
{
	cout << "\nBefore Swapping: " << s1.a << "-" << s1.b;
	s1.a=s1.a+s1.b;
	s1.b=s1.a-s1.b;
	s1.a=s1.a-s1.b;
	cout << "\nAfter Swapping: " << s1.a << "-" << s1.b;
}
main()
{
	Swap s(4, 6);
	swap(s);
}

