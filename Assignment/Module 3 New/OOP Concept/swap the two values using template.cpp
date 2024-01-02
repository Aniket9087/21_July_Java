#include <iostream> 
using namespace std; 
template <class T> 
swap_numbers(T& x, T& y) 
{ 
	T t; 
	t = x; 
	x = y; 
	y = t;
}
main() 
{ 
	int a, b; 
	cout<<"Enter First Number :"<<endl;
	cin>>a;
	cout<<"Enter Second Number :"<<endl;
	cin>>b;
	swap_numbers(a, b); 
	cout <<"First Number :"<<a<< endl;
	cout <<"Second Number :"<<b<< endl;
}

