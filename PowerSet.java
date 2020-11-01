//Here we have to found the power set of given set
//Basic approach is to use recursion of normal for loops


//Efficient approach is to use bitwise operator


class PowerSet {
	public static void main(String[] args) {
		char[] set = {'a', 'b', 'c'};
		powerSet(set, 3);
	}
	static void powerSet(char[] set, int n) {

		int set_size = (int)Math.pow(2, n);
		int counter, j;

		for (counter = 0; counter < set_size; counter++) {
			for (j = 0; j < n; j++) {
				if ((counter & (1 << j)) > 0)
					System.out.print(set[j]);
			}
			System.out.println();
		}
		return;
	}
}

//Problem is available on geeksforgeeks