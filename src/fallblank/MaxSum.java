package fallblank;
/**
*子序列的最大和问题
*问题：给定一个序列，求其最大和
*输入：3 -2 1 5 -6 4
*输出：7
*/

public class MaxSum{
	public static int maxSum(int[] array){
		int max = array[0];
		int sum = 0;
		for (int i=0; i<array.length;i++) {
			if (sum > 0) {
				sum+=array[i];
			}else{
				sum = array[i];
			}
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] array = {3,-2,1,5,-6,4};
		System.out.println(maxSum(array));
	}
}