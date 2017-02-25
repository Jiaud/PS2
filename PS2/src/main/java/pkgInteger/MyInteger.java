package pkgInteger;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven()
	{
		return (iValue % 2) == 0;
	}
	
	public boolean isOdd()
	{
		return (iValue % 2) == 1;
	}
	
	public boolean isPrime()
	{
	    int i;
	    for (i = 2; i <= iValue / 2; i++)   
	    {
	        if (iValue % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static boolean isEven(int mInt)
	{
		return (mInt % 2) == 0;
	}
	
	public static boolean isOdd(int mInt)
	{
		return (mInt % 2) == 1;
	}
	
	public static boolean isPrime(int mInt)
	{
	    int i;
	    for (i = 2; i <= mInt / 2; i++)   {
	        if (mInt % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	public static boolean isEven(MyInteger mInt)
	{
		return mInt.isEven();
	}
	
	public static boolean isOdd(MyInteger mInt)
	{
		return mInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger mInt)
	{
		return mInt.isPrime();
	}
	
	public boolean equals(int testInt)
	{
		if (testInt == iValue)
			return true;
		return false;
	}
	
	public boolean equals(MyInteger mInt)
	{
		if (mInt.iValue == this.iValue)
			return true;
		return false;
	}
	
}
