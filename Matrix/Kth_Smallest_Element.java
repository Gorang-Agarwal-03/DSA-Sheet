package Matrix;

import java.util.PriorityQueue;

public class Kth_Smallest_Element {
    public static int kthSmallest(int[][]mat,int n,int k)
	{
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.add(mat[i][j]);
            }
        }
        int count =0;
        while(!pq.isEmpty()){
            int ans = pq.poll();
            count++;

            if(count==k){
                return ans;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int mat[][] ={
            {16,28,60,64},
            {22,41,63,91},
            {27,50,87,93},
            {36,78,87,94}
        };
        int k=3;
        int n=4;
        int ans = kthSmallest(mat, n, k);
        System.out.println(ans);
    }
}
