import java.util.Arrays;

class square_of_sorted_array {
    public int[] sortedSquares(int[] nums) 
    {
      int n = nums.length;
      int ans[] = new int[n];
      int left = 0; 
      int right = n-1;
      int k = n-1;    

      while (left<=right)
      {
        int leftsqr = nums[left] * nums[left];
        int rightsqr = nums[right] * nums[right];

        if(leftsqr > rightsqr)
        {
            ans[k] = leftsqr;
            left++;
        }
        else
        {
            ans[k] = rightsqr;
            right--;
        }
        k--;

      }   
      return ans;
    }
     public static void main(String[] args) {

        int[] nums = {-7, -3, 2, 3, 11};

        square_of_sorted_array obj = new square_of_sorted_array();

        int[] result = obj.sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}