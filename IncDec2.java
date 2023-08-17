//Code depicting simple arithmetic operation after incrementation and decrementation of a variable.

class IncDec2 {
    public static void main(String[] args) 
	{
		int a=6;
		System.out.println(++a - ++a + --a * a++);    //48
                        //  7  -  8  +   7  *  7   
    }
    
}
