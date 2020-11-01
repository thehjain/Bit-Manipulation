//Here we have to divide the two numbers without
//using divide operator or sign

//Naive approach is to keep substracting the divisor
//from dividend

//Efficient approach is to use bitwise operators


class DivideWithoutSign {
	public static void main(String[] args) {

		long a = 43, b = -8;

		System.out.println(divide(a, b));

	}
	static long divide(long a, long b) {

		long sign = ((a < 0) ^ (b < 0)) ? -1 : 1;

		a = Math.abs(a);
		b = Math.abs(b);

		long temp = 0, q = 0;

		for (int i = 31; i >= 0; --i) {
			if (temp + (b << i) <= a) {
				temp += b << i;
				q |= 1L << i;
			}
		}
		return (sign * q);
	}
}

//Problem is available on geeksforgeeks