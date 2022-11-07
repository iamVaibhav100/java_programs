package java_programs;

public class missingNumber {

    public int findNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;

        for (int i: nums) {
            sum -= i;
        }

        return sum;
    }


    public static void main(String[] args) {
        missingNumber m = new missingNumber();
        int result = m.findNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12});
        System.out.println(result);
    }
}
