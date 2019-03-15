package environment;



public class Massiv {
   
	int a = 5;
	int b = 1;
	int c = 0;
	
	public int sum(int a, int b) {
		
		return a + b;
	}

	public double division(int a, int b) {
		try {
		return a / c;
	}
		catch(ArithmeticException e)
		{
			System.out.println("exception");
		}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	
	public int arraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	public int sum2(int a, int b) {
		return a + b;
	}

	public double division2(int a, int b) {
		return a / b;
	}

	public int minus2(int a, int b) {
		return a - b;
	}

	public int multiply2(int a, int b) {
		return a * b;
	}

	public int arraySum2(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
    
    
    
}
