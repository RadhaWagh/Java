class Human
{
	private int age;
	private String name;

	public int getAge()
	{
		return age;
	}
	public void setAge(int age,Human obj)
	{
		Human obj1=obj;
		obj1.age=age;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String nameString)
	{
		this.name=name;
	}

	//public void setName(String n)
	//{
	//	name=n;
	//}

}

public class Demo
{
	public static void main(String[] args) 
	{
		Human obj = new Human();

		obj.setAge(19,obj);
		obj.setName("Radha");

		System.out.println(obj.getName() + " : " +obj.getAge());
	}

}