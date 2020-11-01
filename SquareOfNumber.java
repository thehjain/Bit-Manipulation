//Idea is to find square of a number without using dividing
//multiplicaton operator

//Simple solution is keep adding the same number n times to
//number and return

//Efficient approach is to use bitwise operator

class SquareOfNumber {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++)
			System.out.println(square(i));

	}
	static int square(int num) {
		if (num == 0)
			return 0;
		if (num < 0)
			num = -num;

		//floor(n/2)
		int x = num >> 1;

		if (num % 2 != 0)
			return 	((square(x) << 2)) + (x << 2) + 1;
		else
			return (square(x) << 2);

	}
}


//Problem is present on geeksforgeeks