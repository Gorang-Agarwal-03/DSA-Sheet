package Array;

public class Next_Permutation {
    public static  void  nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind =i;
                break;
            }
        }
        if(ind == -1){
            int i=0;
            int j=n-1;
            while(i!=j){
                int temp=nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            for(int x=0;x<=n;x++){
                System.out.println(nums[x]);
            }
        }
        for(int i =n-1;i>=0;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }
        int i=0+ind+1;
        int j=n-1;
        while(i!=j){
            int temp=nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        for(int x=0;x<=n;x++){
            System.out.println(nums[x]);
        }

        
        
    }
    // Second method 
    static void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] nums,int i,int j){
      int temp=nums[i];
      nums[i]=nums[j];
      nums[j]=temp;
  }
    public static  void  nextPermutation(int[] nums){
        int ind1=-1;
     int ind2=-1;
     // step 1 find breaking point 
     for(int i=nums.length-2;i>=0;i--){
         if(nums[i]<nums[i+1]){
             ind1=i;
             break;
         }
     }
     // if there is no breaking  point 
     if(ind1==-1){
         reverse(nums,0);
         for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]+" ");
         }
     }
     
     else{
         // step 2 find next greater element and swap with ind2
         for(int i=nums.length-1;i>=0;i--){
             if(nums[i]>nums[ind1]){
                 ind2=i;
                 break;
             }
         }

         swap(nums,ind1,ind2);
         // step 3 reverse the rest right half
         reverse(nums,ind1+1);
         for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]+" ");
         }
     }
 }
    public static void main(String[] args) {
        int []nums = {1,2,3};
        nextPermutation(nums);
    }
}
