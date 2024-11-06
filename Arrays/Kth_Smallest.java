package Arrays;

import java.util.PriorityQueue;

public class Kth_Smallest {
    

// User function Template for Java

    public static int kthSmallest(int[] arr, int k) {
        // Your code here
       PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b) -> b-a);

        for(int i =0;i<arr.length;i++){
            maxheap.offer(arr[i]);

            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        return maxheap.peek();
}
}

