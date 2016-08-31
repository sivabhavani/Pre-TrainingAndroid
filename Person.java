class Person
{
	private String name;
	private String address;
	Person(String name,String address)
	{
		this.name=name;
		this.address=address;
		
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;	
	}
	public void setAddress(String n)
	{
		address=n;
	}
	public String toString()
	{
		 return "Person[name=" + name + ", Address=" +address + " ]";
	}
}

class Student extends Person
{
	private String program;
	private int year;
	private double fee;
	Student(String name,String address,String program,int year,double fee)
	{
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;	

	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public String getYear()
	{
		return year;
	}
	public String getProgram()
	{
		return program;
	}
	public void setProgram(String p)
	{
		this.program=program;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	public double getFee()
	{
		return fee;
	}
	public String toString()
	{
		 return "Person[name=" + super.name + ", Address=" + super.address + ", fee="
            +fee+ ",program="+program+",Year="+year+" ]";
	}

}
class Staff extends Person
{
	private String school;
	private double pay;
	Staff(String name,String address,String school,double pay)
	{
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public void setSchool(String school)
	{
		this.school=school;
	}
	public String getSchool()
	{
		return school;
	}
	public void setPay(double pay)
	{
		this.pay=pay;
	}
	public double getPay()
	{
		return pay;
	}
	public String toString()
	{
		 return "Person[name=" + super.name + ", Address=" + super.address + ", school="
            + school+ ",pay="+pay+" ]";
	}
}