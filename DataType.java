class DataType 
{
	public static void main(String[] args) 
	{
        // every data type have their supported range, properties and values .
		byte b=10;
		byte b2=127;
		//byte b=10.5;//C.E:possible loss of precision
		//byte b=true;//C.E:incompatible types
		//byte b="abcd";//C.E:incompatible types

		short s=130;
		//short s1=32788;

		int i=32788;   ///0
		//int j=9.6;//C.E:possible loss of precision
		//int k=true;//C.E:incompatible types
		//int l=false;//C.E:incompatible types

		int smallNumber = 123;// Suitable for small to medium-sized values
		//4 byte

		long bigNumber = 100000000000L; // Used for larger values
		//8 byte

		//floating point data types  3.5 3.5 5.32323
		float f = 2994.0f; //0.0
		double d=299792458.0;

		double f1=1.0/3;  // 0.0--->double 1/3f 1/3   1/3 =int
		//1/3 0.33333 === 0.0 
		// 3.0/2 ==float
		float f2=1/3f;
		//0.3333333432674408
		//0.33333334


		///boolean
		boolean b1=true;      //  
		boolean b5=false;      //  
		//boolean b2=True;      //
		//boolean b3="True";    //
		//boolean b4=0;   
		//
		
		char ch =66;
		System.out.println(b);
		System.out.println(b2);
		//System.out.println(s1);
		System.out.println(i);
		System.out.println(smallNumber);
		System.out.println(bigNumber);
		System.out.println(f);
		System.out.println(d);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(b1);
		System.out.println(b5);
		System.out.println(ch);

		






	}
}