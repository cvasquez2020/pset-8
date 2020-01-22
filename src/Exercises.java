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
		return middleThree;
	}

	public boolean increasing(int[] numbers) {
		if (numbers == null || numbers.length < 3) {
			return false;
		}
		for (int i = 0; i < numbers.length - 2; i++) {
			if (numbers[i] < numbers[i + 1] && numbers[i + 1] < numbers[i + 2]) {
				return true;
			}
		}
		return false;
	}

	public boolean everywhere(int[] numbers, int x) {
		if (numbers == null || numbers.length < 1) {
			return false;
		}
		for (int i = 1; i < numbers.length - 1; i++) {
		    if (numbers[i - 1] != x && numbers[i + 1] != x && numbers[i] != x) {
		        return false;
		    }
		}
		return true;
	}

	public boolean consecutive(int[] numbers) {
		if (numbers == null || numbers.length < 1) {
			return false;
		}
		for (int i = 0; i < numbers.length - 2; i++) {
			int sum = numbers[i] % 2 + numbers[i + 1] % 2 + numbers[i + 2] % 2;
			if (sum == 0 || sum == 3) {
				return true;
			}
		}
		return false;
	}

	public boolean balance(int[] numbers) {
		if (numbers == null || numbers.length < 2) {
			return false;
		}
		for (int i = 0; i < numbers.length; i++) {
			int left = 0;
			int right = 0;

			for (int o = 0; o < i; o++) {
				left += numbers[o];
			}
			for (int o = i; o < numbers.length; o++) {
				right += numbers[o];
			}
			if (left == right) {
				return true;
			}
		}
		return false;
	}

	public int clumps(String[] values) {
		int tally = 0;

		if (values == null) {
			return -1;
		}
		for (String word : values) {
			if (word.isEmpty()) {
				return -1;
			}
		}
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i].equals(values[i + 1]) && i == 0) {
				tally++;

			} else if (values[i].equals(values[i + 1]) && !(values[i].equals(values[i - 1]))) {
						tally++;
			}
		}
		return tally;
	}
}
