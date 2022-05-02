import java.util.ArrayList; 

public class BevShop implements BevShopInterface
{
	int currentOrderId; 
	int numOfAlcInOrder; 
	ArrayList<Order> orders; 
	
	public BevShop()
	{
		orders = new ArrayList<>(); 
	}
	
	public String toString()
	{
		String s = "Monthly Order\n"; 
		
		for(Order o : orders)
		{
			s+=o.toString(); 
		}
		s+="Total sale: " +totalMonthlySale(); 
		
		return s; 
	}
	
	public boolean validTime(int time)
	{
		if(time >= MIN_TIME && time <= MAX_TIME)
		{
			return true; 
		}
			return false; 
	}
		
	public boolean validAge(int age)
	{
		if(age > MIN_AGE_FOR_ALCOHOL)
		{
			return true; 
		}
		else
		{
			return false; 
		}
	}
	
	public boolean eligibleForMore()
	{
		if(numOfAlcInOrder < 3)
		{
			return true; 
		}
		else
		{
			return false; 
		}
	}
	
	public boolean isMaxFruit(int num)
	{
		if(num > MAX_FRUIT)
		{
			return true; 
		}
		else
		{
			return false; 
		}
	}
	
	public void startNewOrder(int time, DAY day, String customerName, int customerAge)
	{
		Customer customers = new Customer(customerName, customerAge); 
		Order order = new Order(time, day, customers); 
		orders.add(order); 
		currentOrderId = orders.indexOf(order); 
		numOfAlcInOrder = 0; 
	}
	
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup)
	{
		orders.get(currentOrderId).addNewBeverage(bevName, size, extraShot, extraSyrup); 
	}
	
	public void processSmoothieOrder(String bevName, SIZE size, int fruitNum, boolean addProtein)
	{
		orders.get(currentOrderId).addNewBeverage(bevName, size, fruitNum, addProtein); 
	}
	public void processAlcoholOrder(String bevName, SIZE size)
	{
		orders.get(currentOrderId).addNewBeverage(bevName, size); 
		numOfAlcInOrder++; 
	}
	
	public int findOrder(int orderNum)
	{
		for(int a = 0; a<orders.size(); a++)
		{
			if(orders.get(a).getOrderNo() == orderNum)
			{
				return a; 
			}
		}
		return -1; 
	}
	public double totalOrderPrice(int orderNum)
	{
		double orderSale = 0; 
		
		for(Order o : orders)
		{
			if(o.getOrderNo() == orderNum)
			{
				for(Beverage b : o.getBeverages())
				{
					orderSale += b.calcPrice(); 
				}
			}
		}
		return orderSale; 
	}
	
	public double totalMonthlySale()
	{
		double totalSale = 0; 
		for(Order o : orders)
		{
			for(Beverage b : o.getBeverages())
			{
				totalSale += b.calcPrice(); 
			}
		}
		return totalSale; 
	}
	
	public int totalNumOfMonthlyOrders()
	{
		return orders.size(); 
	}
	public void sortOrders()
	{
		for (int a = 0; a < orders.size()-1; a++)
		{
			int minOrderNumId = a; 
			for (int b = a+1; b< orders.size(); b++)
			{
				if(orders.get(b).getOrderNo()< orders.get(minOrderNumId).getOrderNo())
				{
					minOrderNumId = b; 
				}
			}
			Order temp = orders.get(minOrderNumId); 
			orders.set(minOrderNumId, orders.get(a)); 
			orders.set(a,  temp); 
		}
	}
	public Order getOrderAtIndex(int index)
	{
		return orders.get(index); 
	}
	
	public Order getCurrentOrder()
	{
		return orders.get(currentOrderId); 
	}
	public int getNumOfAlcoholDrink()
	{
		return numOfAlcInOrder; 
	}
	public int getMaxOrderForAlcohol()
	{
		return MAX_ORDER_FOR_ALCOHOL; 
	}
	public int getMinAgeForAlcohol()
	{
		return MIN_AGE_FOR_ALCOHOL; 
	}

}