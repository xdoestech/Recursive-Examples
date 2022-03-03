package basicRecursion0;

public class BasicRecursion {
	/**
	 * checks to see if sum is possible from a set integers in array
	 * @param set
	 * @param n
	 * @param sum
	 * @return
	 */
	public boolean isSubsetSum(int set[], int n, int sum) {
		if (sum == 0) {
			return true;
		}
		if ((n == 0) && (sum != 0)) {
			return false;
		}
		if (set[n - 1] > sum) {
			return isSubsetSum(set, n - 1, sum);
		}
		return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
	} 
	
	/**
	 * returns the ways to get a specific basketball score
	 * @param n
	 * @return
	 */
	int paths(int n) {
		  if (n == 1) {
		    return 1;
		  }
		  if (n == 2) {
		    return 2;
		  }
		  if (n == 3) {
		    return 4;
		  }
		  return paths(n - 1) + paths(n - 2) + paths(n - 3);
		}
	
	/**
	 * finds minimum value in an array
	 * @param numbers
	 * @param startIndex
	 * @return
	 */
	public int recursiveMin(int numbers[], int startIndex) {
		  if (startIndex == numbers.length - 1) {
		    return numbers[startIndex];
		  } else {
		    return Math.min(numbers[startIndex], recursiveMin(numbers,startIndex+1));
		  }
		}
	/**
	 * returns binary representation of string
	 * @param num
	 * @return
	 */
	public String decToBinary (int num) {
		  if (num < 2)
		    return Integer.toString(num);
		  else
		    return decToBinary(num/2) + num%2;
		}
}
