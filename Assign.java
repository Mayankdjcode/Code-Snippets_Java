//Assignment of values and operations

class Assign 
{
	public static void main(String[] args) 
	{
		int num=10;
		int a=num+5;
    
		System.out.println("---------------/+=/-------------");
		//+= 
		System.out.println(a);
		
        System.out.println(num-=5); // shorthand notation of num=num-5
		System.out.println(num=num+5);
		System.out.println(num-= 3);
		System.out.println(); //gap

		System.out.println("----------------/=-/-------------");
		//-=
		int s=10;
		System.out.println(s);
		System.out.println(s-=5);
		System.out.println();

		System.out.println("----------------/*=/-------------");
		//*=
		int p=5;
		System.out.println(p);
		System.out.println(p*=5);
		
		System.out.println("----------------/*=/-------------");
		//%=
		int k=10;
		System.out.println(k);
		System.out.println(k%=2); 
	}
}