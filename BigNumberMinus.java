package big_number_minus;

public class BigNumberMinus {
	public static void main(String args[]) {
		String num1 = "2340";
		String num2 = "234567";
		
		int[] nums1 = new int[10000];
		int[] nums2 = new int[10000];
		
		if (num1.length() < num2.length()) {
			String tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = 0;
			nums2[i] = 0;
		}
		
		int j = 0;
		for (int i = num1.length() - 1; i > -1; i--) {
			nums1[j] = num1.charAt(i) - 48;
			j++;
		}
		
		j = 0;
		for (int i = num2.length() - 1; i > -1; i--) {
			nums2[j] = num2.charAt(i) - 48;
			j++;
		}
		

		int back = 0;
		for (int i = 0; i < num1.length() - 1; i++) {
			if (nums1[i] < nums2[i]) {
				back = 10;
				nums1[i + 1]--;
			} 
			
			nums1[i] = (nums1[i] + back) - nums2[i];
		}
		
		for (int i = num1.length() - 1; i > -1; i--) {
			System.out.print(nums1[i]);
		}
	}
}
