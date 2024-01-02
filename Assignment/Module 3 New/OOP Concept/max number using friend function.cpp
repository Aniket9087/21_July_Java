
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
	if(s1.a>s1.b)
	{
		cout<<"First Number Is Max"<<endl;
	}
	else if(s1.a<s1.b)
	{
		cout<<"First Number Is Max"<<endl;
	}
	else
	{
		cout<<"Value Are same or zero"<<endl;
	}
}
main()
{
	Swap s(4, 6);
	swap(s);
}

