#include<iostream> 
using namespace std;  
class A 
{ 
	public: 
		A() 
		{ 
			cout<<"Class A constructor"<<endl; 
		} 
};  
class B: public A 
{ 
	public: 
		B() 
		{ 
			cout<<"Class B constructor"<<endl; 
		} 
}; 
class C: public B 
{ 
	public: 
		C() 
		{ 
			cout<<"Class C constructor"<<endl; 	
		}
}; 
main() 
{ 
	C obj; 
}

