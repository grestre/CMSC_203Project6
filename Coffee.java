/*Class: CMSC203   
 * Instructor:
 * Description: 
 * Due: 5/2/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Geronimo Restrepo*/
public class Coffee extends Beverage
{
	boolean extraShot; 
	boolean extraSyrup; 
	final double shotCost = 0.5; 
	final double syrupCost = 0.5; 
	
	public Coffee(String name, SIZE size, boolean extraShot1, boolean extraSyrup1)
	{
		super(name, TYPE.COFFEE, size);
		extraShot = extraShot1; 
		extraSyrup = extraSyrup1; 
	}
	
	public String toString()
	{
		String s = getBevName() +", " +getSize(); 
		
		if(extraShot)
		{
			s += "Extra shot";
		}
		if(extraSyrup)
		{
			s += "Extra syrup";
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
		
		if(extraShot)
		{
			price += shotCost; 
		}
		
		if(extraSyrup)
		{
			price += syrupCost; 
		}
		
		return price; 
	}
	
	public boolean equals(Coffee coffee)
	{
		if(super.equals(coffee) && extraShot == coffee.getExtraShot() && extraSyrup == coffee.getExtraSyrup())
		{
			return true; 
		}
		else
		{
			return false; 
		}
	}
	public boolean getExtraShot()
	{
		return extraShot; 
	}
	public boolean getExtraSyrup()
	{
		return extraSyrup; 
	}
	public double getShotCost()
	{
		return shotCost; 
	}
	public double getSyrupCost()
	{
		return syrupCost; 
	}
	
	public void setExtraShot(boolean extraShot1)
	{
		extraShot = extraShot1; 
	}
	public void setExtraSyrup(boolean extraSyrup1)
	{
		extraSyrup = extraSyrup1; 
	}
}
