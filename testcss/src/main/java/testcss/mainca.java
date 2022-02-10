package testcss;


class Xyz
{
	 public void add()
	 {
		 int a,b,c;
		 a=10;
		 b=20;
		 c=a+b;
		 System.out.println("Add="+c);
		 }

	public  void sub()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a-b;
		System.out.println("sub="+c);
	
		}

}



public class mainca {

	public static void main(String[] args) {
		
		
				 Xyz xyz=new Xyz();
				 xyz.add();
				 xyz.sub();
		

	}

}
