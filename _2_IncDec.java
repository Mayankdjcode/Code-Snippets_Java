//Code analyzing behaviour of Pre, Post Increment and Decrement operators

class _2_IncDec 
{
	public static void main(String[] args) 
	{
		
		int a=7;
		System.out.println(a);    //7
		
        //increment
        System.out.println(a++);  //post-increment //7
		System.out.println(++a);  //pre-increment  //9
        
        //decrement
		System.out.println(a--);  //post-increment //9
		System.out.println(--a);  //pre-increment  //7
		  

	}
}
