/*Class: CMSC203   
 * Instructor:
 * Description: 
 * Due: 5/2/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Geronimo Restrepo*/
public class Smoothie extends Beverage
{
	int fruitNum; 
	boolean addProtein; 
	final double fruitCost = 0.5; 
	final double proteinCost = 1.5; 
	
	public Smoothie(String name, SIZE size, int fruitNum1, boolean addProtein1)
	{
		super(name, TYPE.SMOOTHIE, size); 
		fruitNum = fruitNum1; 
		addProtein = addProtein1; 
	}
	public String toString()
	{
		
	String s = getBevName() + ", " +getSize() + " "+fruitNum + " Fruits"; 
	
	if(addProtein)
	{
		s += " Protein powder"; 
	}
	
	s += " " +calcPrice(); 
	return s; 
	}
public boolean equals(Smoothie smoothie1)
{
	if(super.equals(smoothie1) && fruitNum == smoothie1.getNumOfFruits() && addProtein == smoothie1.getAddProtein())
	{
		return true; 
}
	else
	{
		return false; 
	}
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
	
	price += fruitNum * fruitCost; 
	if(addProtein)
	{
		price += proteinCost; 
	}
	return price; 
}
public int getNumOfFruits()
{
	return fruitNum; 
}
public boolean getAddProtein()
{
	return addProtein; 
}
public double getFruitCost()
{
	return fruitCost; 
}
public double getProteinCost()
{
	return proteinCost; 
}

public void setFruitNum(int fruitNum1)
{
	fruitNum = fruitNum1; 
}

public void setProteinPowder(boolean addProtein1)
{
	addProtein = addProtein1;
}
}
