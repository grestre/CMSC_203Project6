/*Class: CMSC203   
 * Instructor:
 * Description: 
 * Due: 5/2/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Geronimo Restrepo*/
public class Alcohol extends Beverage
{
	private boolean isWeekend; 
	final double weekendFee = 0.6; 
	
	public Alcohol(String name, SIZE size, boolean isWeekend1)
	{
		super(name, TYPE.ALCOHOL, size);
		isWeekend = isWeekend1; 
	}
	
	public String toString()
	{
		String s = getBevName() +", " +getSize(); 
		
		if(isWeekend)
		{
			s += " Weekend"; 
		}
		
		s += " " +calcPrice(); 
		
		return s; 
	}
	
	public double calcPrice()
	{
		double price = super.getBasePrice(); 
		if(super.getSize() == SIZE.MEDIUM)
		{
			price += super.getSizePrice(); 
		}
		
		else if(super.getSize() == SIZE.LARGE)
		{
			price += 2 * super.getSizePrice(); 
		}
		
		if(isWeekend)
		{
			price += weekendFee; 
		}
		
		return price; 
	}
	
	public boolean getIsWeekend()
	{
		return isWeekend;
	}
	
	public double getWeekendFee()
	{
		return weekendFee; 
	}
	
	public void setIsWeekend(boolean isWeekend2)
	{
		isWeekend = isWeekend2; 
	}
	
}
