//Here we have to check if number is power of 2 or not

//Naive approach is two check by dividing 2 till we get
//the number


//Efficient approach is to bit as if number is power of 2
//then only one bit will be present in that number

class Powerof2 {
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(31) ? "Yes" : "No");
		System.out.println(isPowerOfTwo(64) ? "Yes" : "No");
	}
	static boolean isPowerOfTwo(int num) {
		return num != 0 && (((num) & (num - 1)) == 0);
	}
}

//Problem is available on geeksforgeeks