public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
	}

	public String[] endsMeet(String[] values, int n) {
		String[] endsMet = {};
		if (values == null || values.length < n || n != (int) n || n <= 0) {
			return endsMet;
		}
		endsMet = new String[n * 2];
		for(int i = 0; i < n; i++) {
			endsMet[i] = values[i];
			endsMet[n * 2 - 1 - i] = values[values.length - 1 - i];
		}
		return endsMet;
	}

	public int difference(int[] numbers) {
		if (numbers == null || numbers.length < 1) {
			return -1;
		}
		int min = numbers[0];

	    for (int number : numbers) {
	        if (number < min) {
	            min = number;
	        }
	    }
		int max = numbers[0];

		for (int number : numbers) {
		    if (number > max) {
		        max = number;
		    }
		}
		return max - min;
	}

	public double biggest(double[] numbers) {
		double max = 0;
		if (numbers == null || numbers.length < 3 || numbers.length % 2 == 0) {
			return -1.0;
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0.0 || numbers[i] < 0) {
				return -1.0;
			}
		}

		double[] biggest = {numbers[0], numbers[numbers.length / 2], numbers[numbers.length - 1]};
		for (double number : biggest) {
		    if (number > max) {
		        max = number;
		    }
		}
		return max;
	}

	public String[] middle(String[] values) {
		String[] middle = {};
		if (values == null || values.length < 3 || values.length % 2 == 0) {
			return middle;
		}
		for (String word : values) {
			if (word.isEmpty()) {
				return middle;
			}
		}
		String[] middleThree = {values[values.length / 2 - 1], values[values.length / 2], values[values.length / 2 + 1]};
		return middleThree;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(int[] numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(String[] values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
