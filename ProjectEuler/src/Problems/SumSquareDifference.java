package Problems;

public class SumSquareDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumSquareDifference sumSqreDiff = new SumSquareDifference();
		System.out.println(sumSqreDiff.CalculateSumOfSquaresOfNNumbers(100));
		System.out.println(sumSqreDiff.CalculateSquaresOfTheSumOfNNumbers(100)-sumSqreDiff.CalculateSumOfSquaresOfNNumbers(100));
	}

	public int CalculateSumOfSquaresOfNNumbers(int n){
		int sumDifference = 0;
		for(int i=0;i<=n;i++){
			sumDifference+=i*i;
		}
		return sumDifference;
	} 
	
	int CalculateSquaresOfTheSumOfNNumbers(int n){
		int sumDifference = 0;
		for(int i=0;i<=n;i++){
			sumDifference+=i;
		}
		return sumDifference * sumDifference;
	} 
}
