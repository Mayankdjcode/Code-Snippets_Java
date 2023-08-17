// Another example depicting simple arithmetic operation after incrementation and decrementation of a variable.

class IncDec3 {
    public static void main(String[] args) 
	{
		int a=7;
		System.out.println((--a + --a)*(++a - a--)+(a++ + --a)*(++a + a--));  //120
                        	//  (6  +  5) *(6   - 6  )+(5   +   5)*(6   +  6)
	}
}
