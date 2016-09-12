package Problems;

public class LargestPrimeFactor {

	/**
	 * @param args
	 */
	
	private long tempPrime = 3;
	
	public static void main(String[] args) {
		long number =600851475143L;
		
		//BigInteger number = new BigInteger("600851475143");
		LargestPrimeFactor LargestPrimeFactor = new LargestPrimeFactor();
		System.out.println(" Largest Prime Factor of "+number+" is :" + LargestPrimeFactor.getLargestPrimeFactor(number));
		//System.out.println(LargestPrimeFactor.isPrime(71));
		
	}

	long getLargestPrimeFactor(long number){
		long LargestFactor = 1;
		
		for(long i = 2;i<number;i++){
			 if(isPrime(i) && number%i==0)
				 LargestFactor = i;
		}
		
		 return LargestFactor;
	}
	
	
	boolean isPrime(long value)
    {
		//check if n is a multiple of 2
	    if (value%2==0) return false;
	    //if not, then just check the odds
	    for(long i=tempPrime;i*i<=value;i+=2) {
	        if(value%i==0)
	            return false;
	    
	    }
	    
	    tempPrime = value;
	    
	    return true;
    }
	
}
