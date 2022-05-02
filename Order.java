/*Class: CMSC203   
 * Instructor:
 * Description: 
 * Due: 5/2/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Geronimo Restrepo*/
import java.util.ArrayList; 
import java.util.Random; 

public class Order 
{
	int orderNo; 
	int orderTime;
	DAY orderDay; 
	Customer customer; 
	ArrayList<Beverage> beverages; 
	
	public Order(int orderTime1, DAY orderDay1, Customer customer1)
	{
		orderNo = generateOrderNumber(); 
		orderTime = orderTime1; 
		orderDay = orderDay1; 
		customer = customer1; 
		beverages = new ArrayList<>(); 
	}
	
	public int generateOrderNumber()
	{
		Random rand = new Random(); 
		int randInt = rand.nextInt(90000 - 10000) + 10000; 
		return randInt; 
	}
	
	public String toString()
	{
		String s = " " +orderDay.toString() + ", " +orderTime + "\n" +customer.toString() + " Order Number: " +orderNo; 
		
		for(Beverage b : beverages)
		{
			s += "\n" + b.toString(); 
		}
		
		s += "\n Order Total: " +calcOrderTotal(); 
		
		return s; 
	}
	
	public boolean isWeekend()
	{
		if(orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY)
		{
			return true; 
		}
		else
		{
			return false; 
		}
	}
		
		public Beverage getBeverage(int itemNumber) 
		{
			return beverages.get(itemNumber);
		}
		public int compareTo(Order order)
		{
			if(orderNo == order.getOrderNo())
			{
				return 0; 
			}
			else if(orderNo > order.getOrderNo())
			{
				return 1; 
			}
			else
			{
				return -1; 
			}
		}
		public double calcOrderTotal()
		{
			double orderTotal = 0; 
			
			for(Beverage b : beverages)
			{
				orderTotal += b.calcPrice(); 
			}
			
			return orderTotal; 
		}
		public int findNumOfBeveType(TYPE type)
		{
			int count = 0; 
			
			for(Beverage b : beverages)
			{
				if(b.getType() == type)
				{
					count ++; 
				}
			}
			return count; 
	}
		
		public int getTotalItems()
		{
			return beverages.size(); 
		}
		
		public void addNewBeverage(String name, SIZE size, boolean extraShot, boolean extraSyrup)
		{
			Coffee coffee1 = new Coffee(name, size, extraShot, extraSyrup); 
			beverages.add(coffee1); 
		}
		public void addNewBeverage(String name, SIZE size, int fruitNum, boolean proteinPowder)
		{
			Smoothie smoothie1 = new Smoothie(name, size, fruitNum, proteinPowder); 
			beverages.add(smoothie1); 
		}
		public void addNewBeverage(String name, SIZE size)
		{
			boolean isWeekend = false; 
			if(orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY)
			{
				isWeekend = true; 
			}
			
			Alcohol alcohol1 = new Alcohol(name, size, isWeekend); 
			beverages.add(alcohol1); 
		}
		
		public int getOrderNo()
		{
			return orderNo; 
		}
		public int getOrderTime()
		{
			return orderTime; 
		}
		public DAY getOrderDay()
		{
			return orderDay; 
		}
		public Customer getCustomer()
		{
			return new Customer(customer); 
		}
		public ArrayList<Beverage> getBeverages()
		{
			return beverages; 
		}
		
		public void setOrderNumber(int orderNumber1)
		{
			orderNo = orderNumber1; 
		}
		public void setOrderTime(int orderTime1)
		{
			orderTime = orderTime1; 
		}
		public void setOrderDay(DAY orderDay1)
		{
			orderDay = orderDay1; 
		}
		public void setCustomer(Customer customer1)
		{
			customer = customer1; 
		}
}
