/*Class: CMSC203   
 * Instructor:
 * Description: 
 * Due: 5/2/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Geronimo Restrepo*/
public abstract class Beverage 
{
	String bevName; 
	TYPE type; 
	SIZE size; 
	final double basePrice = 2.0; 
	final double sizePrice = 1.0; 
	
	public Beverage(String name1, TYPE type1, SIZE size1)
	{
		bevName = name1; 
		type = type1; 
		size = size1; 
	}
	
	public abstract double calcPrice(); 
	
	public String toString()
	{
		return bevName +", " +size; 
	}
	
	public boolean equals(Beverage bev)
	{
		if(bevName.equals(bev.getBevName()) && type == bev.getType() && size ==bev.getSize())
		{
			return true; 
		}
		else
		{
			return false; 
		}
	}
	
	public String getBevName()
	{
		return bevName;
	}
	
	public TYPE getType()
	{
		return type; 
	}
	
	public SIZE getSize()
	{
		return size; 
	}
	
	public double getBasePrice()
	{
		return basePrice; 
	}
	
	public double getSizePrice()
	{
		return sizePrice; 
	}
	
	public void setName(String name1)
	{
		bevName = name1; 
	}
	
	public void setType(TYPE type1)
	{
		type = type1; 
	}
	
	public void setSize(SIZE size1)
	{
		size = size1; 
	}
}
