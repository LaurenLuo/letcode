package WiggleSubsequence;
//No 376
public class WiggleSubsequence {
	public int wiggleMaxLength(int[] nums) {
		int len = nums.length;
		if (nums.length <= 1)
			return len;
		int maxLen = len;
		int flag = 0;
		for (int i = 1; i < len; i++) {
			if (nums[i] == nums[i - 1]) {
				maxLen--;
			} else if (nums[i] > nums[i - 1]) {//  如果递增flag=1
				if (flag == 1)
					maxLen--;
				else
					flag = 1;
			} else if (nums[i] < nums[i - 1]) {// 如果递减flag=-1
				if (flag == -1)
					maxLen--;
				else
					flag = -1;
			}

		}

		return maxLen;
	}

	public static void main(String[] args) {
		WiggleSubsequence w = new WiggleSubsequence();
		int[] nums = { 1, 7, 4, 9, 2, 5 };

		System.out.print(w.wiggleMaxLength(nums));
	}
}
