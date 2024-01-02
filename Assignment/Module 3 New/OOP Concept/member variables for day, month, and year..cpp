#include <iostream>
#include <stdexcept>

class Date 
{
	private:
	    int day;
	    int month;
	    int year;
	
	public:
	    Date(int d, int m, int y) : day(d), month(m), year(y) 
		{
	        if (!isValidDate(day, month, year)) 
			{
	            throw std::invalid_argument("Invalid date");
	        }
	    }
	    int getDay() const 
		{
	        return day;
	    }
	
	    int getMonth() const 
		{
	        return month;
	    }
	
	    int getYear() const 
		{
	        return year;
	    }
	
	    void setDay(int d) 
		{
	        if (isValidDate(d, month, year)) 
			{
	            day = d;
	        }
			else 
			{
	            throw std::invalid_argument("Invalid day");
	        }
	    }
	
	    void setMonth(int m) 
		{
	        if (isValidDate(day, m, year)) 
			{
	            month = m;
	        }
			else 
			{
	            throw std::invalid_argument("Invalid month");
	        }
	    }
	
	    void setYear(int y) 
		{
	        if(isValidDate(day, month, y)) 
			{
	        	year = y;
	        } 
			else 
			{
	            throw std::invalid_argument("Invalid year");
	        }
	    }
	
	    static bool isValidDate(int d, int m, int y) 
		{
	        return (d >= 1 && d <= 31) && (m >= 1 && m <= 12) && (y >= 1);
	    }
};

main() 
{
    try {
        	Date myDate(10, 5, 2023);
        	std::cout << "Initial date: " << myDate.getDay()<<myDate.getMonth()<< myDate.getYear() << std::endl;
	        myDate.setDay(35);
	        myDate.setMonth(15);
	        myDate.setYear(0); 
    } 
	catch (const std::invalid_argument& e) 
	{
        std::cerr << "Error: " << e.what() << std::endl;
    }

    try 
	{
        Date myDate(15, 8, 2022);
        std::cout << "Updated date: " << myDate.getDay() << "/" << myDate.getMonth() << "/" << myDate.getYear() << std::endl;
    }
	catch (const std::invalid_argument& e) 
	{
        std::cerr << "Error: " << e.what() << std::endl;
    }
}

