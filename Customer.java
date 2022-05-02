/*Class: CMSC203   
 * Instructor:
 * Description: 
 * Due: 5/2/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Geronimo Restrepo*/
public class Customer 
{
	String name; 
	int age; 
	
	public Customer(String name1, int age1)
	{
		name = name1; 
		age = age1; 
	}
	
	public Customer(Customer c)
	{
		name = c.getName(); 
		age = c.getAge(); 
	}
	
	public String toString()
	{
		return name + ", " +age; 
	}
	
	public String getName()
	{
		return name; 
	}
	
	public int getAge()
	{
		return age; 
	}
	
	public void setName(String name1)
	{
		name = name1; 
	}
	
	public void setAge(int age1)
	{
		age = age1; 
	}
}
