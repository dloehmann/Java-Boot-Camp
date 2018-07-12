package practice3SumCalc;

public class Main {

    public static void main(String[] args) {
    	int[] numbers = new int[] {4,3,6,7,42};
    	System.out.println("The answer is " + sum(numbers));
    }
    
    private static int sum(int[] numbers) {
    	// initialize the result
    	int result = 0;
    	for (int i : numbers) {
        	System.out.println(i);
        	// add each number to the result/ sum up
        	result += i;
    	}
    	return result;

    }
}
