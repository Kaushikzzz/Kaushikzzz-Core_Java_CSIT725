package student;
public class Student //ek file me bhut sare public class rhega!
{
	private int id;
	private char gender;
	private String branch;
	private String name;
	
	public int getId()
	{
		return this.id;
	}
	public char getGender()
	{
		return this.gender;
	}
	public String getBranch()
	{
		return this.branch;
	}
	public String getName()
	{
		return this.name;
	}
	public boolean setId(int id)
	{
		if(id>=100000000 && id<=999999999)
		{
			this.id=id;
			return true;
		}
		else return false;
	}
	public boolean setName(String name)
	{
		if(name.matches("[a-zA-Z]+"))
		{
			this.name=name;
			return true;
		}
		return true;
	}
	/*public boolean setName(String name)
	{
	    for (char c : name.toCharArray()) 
	    {
	        if (!Character.isLetter(c)) 
	        {
	            return false;
	        }
	    }
	    this.name=name;
	    return true;
	}*/
	public boolean setGender(char gender)
	{
		if(gender =='M' || gender=='F')
		{
			this.gender=gender;
			return true;
		}
		else return false;
	}
	public boolean setBranch(String branch)
	{
		if(branch.equals("BCA") || branch.equals("MCA"))
		{
			this.branch=branch;
			return true;
		}
		else return false;
	}
	public String toString()
	{
		String s;
		s="".format("Id: %d\nName: %s\nGender: %c\nBranch: %s\n"
				,this.id, this.name,this.gender,this.branch);
		return s;
	}
}