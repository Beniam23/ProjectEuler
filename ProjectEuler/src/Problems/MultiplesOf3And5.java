package Problems;

public class MultiplesOf3And5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<1000;i++){
			if(i % 3 == 0)
				sum+=i;
			else if(i % 5 == 0)
				sum+=i;
		}

		System.out.println("I :"+sum);
	}

}
