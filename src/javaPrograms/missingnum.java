package javaPrograms;

public class missingnum {

	static int getmissingNo(int a[], int n) {
		int total = 1;
		for (int i = 2; i <= (n + 1); i++) {
			total = total + i;
			total = total - a[i - 2];
		}
		return total;
	}

	public static int findDisappearedNumbers(int[] nums) {
		int n = nums.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++)
			sum -= nums[i];
		return sum;
	}

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5, 8 };
		System.out.println(getmissingNo(arr1, arr1.length));

		System.out.println("//-------------------");

		int[] a = { 1, 2, 3, 4, 5, 7 };
		System.out.println(findDisappearedNumbers(a));

	}
}
