package Arrays;

//                     Most Important Question (LeetCode 287) this is done by using floyd cycle algo

public class Find_Dublicate {
    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast =0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];

        }while(slow!=fast);
        fast =0;
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int arr[] ={1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
}
