//	Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user

package com.assignment;

class Complex
{
	int real,imaginary;
	
	Complex(int r, int i)
	{
		real=r;
		imaginary=i;
	}
	
	Complex sum(Complex c)
	{
		return new Complex(real+c.real,imaginary+c.imaginary);	
	}
	Complex difference(Complex c)
	{
		return new Complex(real-c.real,imaginary-c.imaginary);
	}
	Complex product(Complex c)
	{
		return new Complex(real*c.real-imaginary*c.imaginary,real*c.imaginary+imaginary+c.real);
		
	}
}
public class Assignment27 
{
	public static void main(String[] args)
	{
		Complex c1=new Complex(2, 3);
		Complex c2=new Complex(4, 5);
		
		Complex sum=c1.sum(c2);
		Complex difference=c1.difference(c2);
		Complex product=c1.product(c2);
		
		System.out.println("Sum: "+sum.real+" "+sum.imaginary+" ");
		System.out.println("Difference: "+difference.real+" "+difference.imaginary+" ");
		System.out.println("Product: "+product.real+" "+product.imaginary+" ");
	}
}
