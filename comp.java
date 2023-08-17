// Comparison Operators

class comp 
{
	public static void main(String[] args) 
	{
        // "==" verifies whether L.H.S. and R.H.S. are equal. 
		System.out.println("------------/==/--------------");
		int a=10;
		int b=10;
		System.out.println(10==10); // output as "true"
		System.out.println(a==b);

         // "!=" verifies whether L.H.S. is not equal to R.H.S. 
		System.out.println("------------/!=/--------------");
		System.out.println(10!=10); // output as "false"
		System.out.println(9!=10);

         // ">" verifies whether L.H.S. is greater than R.H.S. 
		System.out.println("------------/>/--------------");
		System.out.println(100>10);
		System.out.println(9>10); 

		System.out.println("------------/</--------------");
		System.out.println(100<10);
		System.out.println(9<10);

		System.out.println("------------/>=/--------------");
		System.out.println(33>=32);
		System.out.println(33>=33);
		System.out.println(33>=45);

        // "<=" verifies whether L.H.S. less than or equal to R.H.S. 
		System.out.println("------------/<=/--------------");
		System.out.println(33<=32);
		System.out.println(33<=33);
		System.out.println(33<=45);


	}
}