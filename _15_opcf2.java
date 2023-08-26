// Decision Making, Control Flow Statements 2
// Pre and Post Increment Operators Involved

class _15_opcf2 
{
	public static void main(String[] args) 
	{
		int x=30,y=20;

		if(++x>30 || ++y>20)
		{
			x++;
		}
		else
		{
			y++;
		}

		System.out.println(x+" "+y);  //31 21
	}
}
