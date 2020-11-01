//Here we have to find the most significant bit
//Basic approach is to keep dividing the number
//by 2 and the right shift 1 by count and return.


//Efficient approach is using log n property

class FindMSB {
	public static void main(String[] args) {
		int n = 273;
		System.out.println(setBit(n));
	}
	static int setBit(int n) {
		int k = (int)(Math.log(n) / Math.log(2));
		return (int)Math.pow(2, k);
	}
}


//Problem is available on geeksforgeeks