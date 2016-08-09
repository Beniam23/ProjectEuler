package Problems;

public class EvenFibonacciNumbers {

	static int n1=1,n2=2,n3=0;
	static int sum=n2;
	public static void main(String[] args) {
		System.out.println(n1+" "+n2);
		Fibonacci();
		System.out.println("sum :"+sum);
	}
	
	static void Fibonacci(){
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		System.out.println("" + n3);
		if(n3 % 2 == 0)
			sum+=n3;
		if(n3<4000000)
			Fibonacci();
	}

}
