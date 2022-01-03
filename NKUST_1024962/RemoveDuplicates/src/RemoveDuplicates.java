public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] myNum = {1,2,3,4,4,5,6,6,7};

        int result = removeDuplicates(myNum);
        System.out.println(result);
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}
