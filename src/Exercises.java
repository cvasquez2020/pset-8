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
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public double biggest(double[] numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public String[] middle(String[] values) {
		// write your code here

		return null;	// default return value to ensure compilation
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
