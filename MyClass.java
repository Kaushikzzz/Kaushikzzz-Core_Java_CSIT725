package student;


public class MyClass
{
	public static void main(String[] args)
	{
		
		Student s = new Student();
		s.setBranch("BCA");
		s.setGender('M');
		s.setId(123456789);
		s.setName("KaushikPrakash");
		System.out.println(s);
		
		Student s2 = new Student();
		s2.setBranch("MCA");
		s2.setGender('F');
		s2.setId(123498765);
		s2.setName("ANKITA");
		System.out.println(s2);
	}
}